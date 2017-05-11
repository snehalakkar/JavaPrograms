<%@page import="com.bridgeLabz.loginRegistraionProject.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="java.lang.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div class="container">
		<center>
			<table width="25%" cellpadding="3" class="table";>
				<%!
					LinkedList l1;
				%>
				
				<% l1 = (LinkedList) request.getAttribute("linkedList"); %>
				<div>
					<p style="font-size: 50px; text-color: #777; left-margin: 40%">Employee
						Details...</p>
				</div>
				<tr>
					<th>First Name</th>
					<!-- <th>Last Name</th>
       		<th>  Email </th>
       		<th>  Address </th>
       		<th> comp_name </th>
       		<th> Age</th>
       		<th> Salary  </th>
       		<th> Gender </th>
       		<th> specialize </th>
       		<th> lang_known </th>
       		<th> Password </th>
       		<th> Contact </th>
       		<th> UserId </th> -->
				</tr>
<%! String mail;
	String fname;%>


				<%
					int count = 1;
					for (int i = 0; i < l1.size(); i++) {
						Employee e1 = (Employee) l1.get(i);
				
					if (count % 2 == 1) {
						mail=e1.getEmail();
						fname=e1.getFirstName();
				%>
				<tr>
					<td style="text-align: center; background-color: #bfbfbf"><a onclick="popup('${mail}')">
					<%=fname %></a>
						<%
									count++;
						%> 
						</td>
						 <%
 	} else {
 		String fname=e1.getFirstName();
 %>
					
				<tr>
					<td style="text-align: center; background-color: #ffffff"><a  onclick="popup('${mail}')"><%=fname %></a>
						<%
									count++;
								}
						%> <%
 	}
 %>
					</td>
				</tr>
			</table>
		</center>
	</div>



	<%-- <%
	for (int i = 0; i < l1.size(); i++) {
		Employee e1 = (Employee) l1.get(i);
		String fname=e1.getFirstName();%>
	<table>
		<tr>
			<td><a href="#myPopupDialog" data-rel="popup"><%= fname %></a></td>
		</tr>
	</table> --%>

	<%-- <div>

		fname1=<%=e1.getFirstName()%><br>
		lname=<%=e1.getLastName() %><br>
		email=<%=e1.getEmail()%><br>
		add=<%=e1.getAddress()%><br>
		comp_name=<%=e1.getComp_name()%><br>
		age=<%=e1.getAge()%><br>
		sal=<%=e1.getSal()%><br>
		gender=<%=e1.getGender()%><br>
		specialize=<%=e1.getSpecialize()%><br>
		lang_known=<%=e1.getLang_known()%><br>
		pass=<%=e1.getPass()%><br>
		contact=<%=e1.getContact()%><br>
		uid=<%=e1.getUserid()%><br>
		
	</div> --%>
	<%-- <% }
	%> --%>
	
	<script type="text/javascript">
	function popup(mail){
		<%
		for (int i = 0; i < l1.size(); i++) {
			Employee e1 = (Employee) l1.get(i);
			String email=e1.getEmail();
			if(mail.equals(email)){
				
			%>
			fname1=<%=e1.getFirstName()%>
			lname=<%=e1.getLastName()%>
			email=<%=e1.getEmail()%>
			add=<%=e1.getAddress()%>
			comp_name=<%=e1.getComp_name()%>
			age=<%=e1.getAge()%>
			sal=<%=e1.getSal()%>
			gender=<%=e1.getGender()%>
			specialize=<%=e1.getSpecialize()%>
			lang_known=<%=e1.getLang_known()%>
			pass=<%=e1.getPass()%>
			contact=<%=e1.getContact()%>
			uid=<%=e1.getUserid()%>
				<%
				}
			}
		%>
	}
	</script>
</body>
</html>