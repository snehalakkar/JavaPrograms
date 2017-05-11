package com.bridgeLabz.loginRegistraionProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String User_Mail = req.getParameter("uemail");
		String User_pass = req.getParameter("pass");
		// String User_Id = req.getParameter("UserId");

		if (UserLogin.validate(User_Mail, User_pass)) {
			pw.print("<html><body> Welcome " + User_Mail + "<br><br></body></html>");
			// RequestDispatcher rdq = req.getRequestDispatcher("details");
			// rdq.include(req, resp);
			/*
			 * HttpSession session = req.getSession();
			 * session.setAttribute("UserId", User_Id);
			 */
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String QRY = "select * from snehal_db.user where user_email=? and user_pass=?";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
				pstmt = con.prepareStatement(QRY);
				pstmt.setString(1, User_Mail);
				pstmt.setString(2, User_pass);
				rs = pstmt.executeQuery();
				
				while(rs.next())
				{
				int user_id=rs.getInt(1);
				HttpSession session = req.getSession();
				session.setAttribute("UserId", user_id);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			finally {
				if (con != null)
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				if (pstmt != null)
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}

			//pw.print("<html><body><a href=reg.jsp><button value='button'>Add Employee</button></a><br><br><a href=details><button value='button'>Display User Details</button></a></body></html>");
			RequestDispatcher rdq = req.getRequestDispatcher("profile.jsp");
			rdq.include(req, resp);
		}

		else {
			System.out.println("Sorry Invalid userEmail & Password ");
			pw.print("<html><body><h1> Sorry invalid username and Password.....</h1></body></html>");
			RequestDispatcher rdq = req.getRequestDispatcher("user_login.jsp");
			rdq.include(req, resp);
		}
		pw.close();
	}

	private static boolean validate(String user_Mail, String user_pass) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean status = false;
		System.out.println(user_Mail);
		System.out.println(user_pass);
		String qry = "select * from snehal_db.user where user_email=? and user_pass=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, user_Mail);
			pstmt.setString(2, user_pass);
			rs = pstmt.executeQuery();
			status = rs.next();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		System.out.println(status);
		return status;
	}
}
