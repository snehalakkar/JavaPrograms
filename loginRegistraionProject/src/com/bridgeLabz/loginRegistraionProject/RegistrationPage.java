package com.bridgeLabz.loginRegistraionProject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationPage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String First_Name = req.getParameter("fname");
		String Last_Name = req.getParameter("lname");
		String email = req.getParameter("email");
		String address = req.getParameter("add");
		String comp_name = req.getParameter("comp_name");
		String age = req.getParameter("age");
		String sal = req.getParameter("sal");
		String gender = req.getParameter("gender");
		String specialized = req.getParameter("specialize");
		String[] lang_known = req.getParameterValues("lang_known");
		String str=Arrays.toString(lang_known);
		String pass = req.getParameter("pass");
		String contact = req.getParameter("contact");

		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into snehal_db.employee_details values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt = con.prepareStatement(qry);
			pstmt.setString(1, First_Name);
			pstmt.setString(2, Last_Name);
			pstmt.setString(3, email);
			pstmt.setString(4, address);
			pstmt.setString(5, comp_name);
			pstmt.setString(6, age);
			pstmt.setString(7, sal);
			pstmt.setString(8, gender);
			pstmt.setString(9, specialized);
			pstmt.setString(10, str);
			pstmt.setString(11, pass);
			pstmt.setString(12, contact);

			int n = pstmt.executeUpdate();
			if (n > 0) {
				System.out.println("Registration Successfull ");
				resp.sendRedirect("emp_login.jsp");
			} else {
				System.out.println("You have to registered again ...");
				resp.sendRedirect("reg.jsp");

			}

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

	}
}