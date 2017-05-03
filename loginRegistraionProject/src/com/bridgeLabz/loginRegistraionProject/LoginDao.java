package com.bridgeLabz.loginRegistraionProject;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDao extends HttpServlet{
public static boolean validate(String empMail,String empPass){
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	boolean status = false;
	System.out.println(empMail);
	System.out.println(empPass);
	String qry="select * from snehal_db.employee_details where Email=? and Password=?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		pstmt=con.prepareStatement(qry);
		pstmt.setString(1, empMail);
		pstmt.setString(2, empPass);
		rs=pstmt.executeQuery();
		 status=rs.next();

	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(pstmt!=null)
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
