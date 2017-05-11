<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user_reg" method="post">
		<table>
			<thead>
				<tr>
					<th colspan="2" style="text-align: center; font-size: 28px;">Enter
						User Information Here</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>UserId</td>
					<td><input type="number" name="UserId" value="" /></td>
				</tr>

				<tr>
					<td>UserName</td>
					<td><input type="text" name="Username" value="" size="50" /></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" name="UserPass" value="" /></td>
				</tr>

				<tr>
					<td>UserEmail</td>
					<td><input type="text" name="UserMail" value="" size="50" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit"
						onmouseover="this.style.backgroundColor='#FF9B9B';return true;"
						onmouseout="this.style.backgroundColor='#ffa31a';return true;" /></td>
					<td><input type="reset" value="Reset"
						onmouseover="this.style.backgroundColor='#FF9B9B';return true;"
						onmouseout="this.style.backgroundColor='#ffa31a';return true;" /></td>
				</tr>

				<tr>
					<td colspan="2">Already registered!! <a href="user_login.jsp">Login
							Here</a></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>