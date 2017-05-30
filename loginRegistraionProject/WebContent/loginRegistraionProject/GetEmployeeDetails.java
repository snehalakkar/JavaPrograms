package com.bridgeLabz.loginRegistraionProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetEmployeeDetails extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HttpSession session = req.getSession();
		int user_id = (int) session.getAttribute("UserId");
		// String qry = "select * from snehal_db.employee_details ORDER BY
		// Salary";
		String qry = "select * from snehal_db.employee_details where user_id=user_id";
		PrintWriter pw = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt = con.prepareStatement(qry);
			pstmt.executeQuery();
			rs = pstmt.getResultSet();

			pw.print(
					"<html><body><table border=1 width=70 background-color: #D8F0DA;><tr><th>\tFirst Name\t</th><th>\tLast Name\t</th><th>  Email </th><th>  Address </th><th> comp_name </th><th> Age</th><th> Salary  </th><th> Gender </th><th> specialize </th><th> lang_known </th><th> Password </th><th> Contact </th><th> UserId </th></tr>");
			while (rs.next()) {
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String email = rs.getString(3);
				String add = rs.getString(4);
				String comp_name = rs.getString(5);
				int age = rs.getInt(6);
				double sal = rs.getDouble(7);
				String gender = rs.getString(8);
				String specialize = rs.getString(9);
				String lang_known = rs.getString(10);
				String pass = rs.getString(11);
				long contact = rs.getLong(12);
				int userid = rs.getInt(13);

				pw.print("<tr><td>\t " + fname + " \t</td><td>\t " + lname + "\t</td><td> " + email + "</td><td> " + add
						+ "</td><<td>" + comp_name + " </td><td>" + age + "</td><td>" + sal + "</td><td>" + gender
						+ "</td><td>" + specialize + "</td><td>" + lang_known + "</td><td>" + pass + "</td><td>"
						+ contact + "</td><td> " + userid + "</td></tr>");
			}
			pw.print("</table><br><br><a href=user_login.jsp><button value='back'style=color:red>Back</button></a></body></html>");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
