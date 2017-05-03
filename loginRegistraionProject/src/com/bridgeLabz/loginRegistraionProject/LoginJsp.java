package com.bridgeLabz.loginRegistraionProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginJsp extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empMail = req.getParameter("uemail");
		String empPass = req.getParameter("pass");
		PrintWriter pw = resp.getWriter();

		if (LoginDao.validate(empMail, empPass)) {
			pw.print("<html><body> Welcome " + empMail);
		}

		else {
			System.out.println("Sorry Invalid username & Password ");
			RequestDispatcher rdq = req.getRequestDispatcher("emp_login.jsp");
			rdq.include(req, resp);
		}
		pw.close();
	}
}
