<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<header> <img src="img/reg1.jpeg" alt="logo"
	style="width: 100%; height: 45px;" /> </header>
</head>
<body>
<div class="container-fluid">
  <div class="row">
    <div class="col-sm-4">
    <div class="container">
		<button type="button" class="btn btn-success">LogOut</button>
	</div>
    </div>
    <div class="col-sm-4">
    <div class="container">
	<a href="reg.jsp"><button type="button" class="btn btn-success">Add Employee</button></a>
	</div>
    </div>
    <form action="details" method="post">
    <div class="col-sm-4">
    <div class="container">
    <input type="submit" value="Display User Details" class="btn btn-success"> 
	</div>
    </div>
    </form>
  </div>
</div>
	
	
	
</body>
</html>