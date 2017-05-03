<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-12">
	<form action="reg" method="post" name='registration' onSubmit="return formValidation();">
		<center>
		<div class="table-responsive">
			<table border="1" width="30%" cellpadding="5" class="table">
				<thead>
					<tr>
						<th colspan="2">Enter Information Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>First Name</td>
						<td><input type="text" name="fname" value="" size="50" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="lname" value="" size="50"/></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email" value="" size="50"/></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><textarea name="add" value="" /></textarea></td>
					</tr>
					<tr>
						<td>Company_Name</td>
						<td><input type="text" name="comp_name" value="" /></td>
					</tr>
					<tr>td>
						<td>Age</td>
						<td><input type="number" name="age" value="" /></td>
					</tr>
					<tr>
						<td>Salary</td>
						<td><input type="text" name="sal" value="" /></td>
					</tr>
					<tr>
						<td>Gender</td>
						<!-- <td><table><tr><td><input type="radio" name="gender" value="male" ></td><td><label
							for="male">Male</label></td></tr>
						<tr><td><input type="radio" name="gender" value="female" /></td><td><label
							for="female">Female</label></td></tr>
						<tr><td><input type="radio" name="gender" value="other" /></td><td><label
							for="other">other</label></td></tr></table>
						</td> -->
						<td><input type="radio" name="gender" value="male" ><label
							for="male">Male</label><br>
							<input type="radio" name="gender" value="female" ><label
							for="female">female</label><br>
							<input type="radio" name="gender" value="other" ><label
							for="other">other</label><br></td>
					</tr>
					<tr>
						<td>Specialized</td>
						<td><input type="text" name="specialize" value="" /></td>
					</tr>
					<tr>
						<td>Languages_Known</td>
						<td><input type="checkbox" name="lang_known" value="hindi" /><label
							for="hindi">hindi</label><br>
						<input type="checkbox" name="lang_known" value="english" /><label
							for="english">english</label><br>
						<input type="checkbox" name="lang_known" value="marathi" /><label
							for="marathi">marathi</label><br>
						<input type="checkbox" name="lang_known" value="kannada" /><label
							for="kannada">kannada</label><br>
						<input type="checkbox" name="lang_known" value="gujrathi" /><label
							for="gujrathi">gujrathi</label><br>
						<input type="checkbox" name="lang_known" value="tamil" /><label
							for="tamil">tamil</label></td>

					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="pass" value="" size="12"/></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="number" name="contact" value="" size="10" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Submit" /></td>
						<td><input type="reset" value="Reset" /></td>
					</tr>
					<tr>
						<td colspan="2">Already registered!! <a href="emp_login.jsp">Login
								Here</a></td>
					</tr>
				</tbody>
			</table>
			</div>
		</center>
		<script type="text/javascript">
		
	function formValidation()  
    {  
    var fname = document.registration.fname;  
    var lname = document.registration.lname;  
    var email = document.registration.email;  
    var add = document.registration.add;  
    var comp_name = document.registration.comp_name;  
    var age = document.registration.age;  
    var sal = document.registration.sal;  
    var gender = document.registration.gender;  
    var specialize = document.registration.specialize;  
    var lang_known = document.registration.lang_known;  
    var pass = document.registration.pass;  
    var contact = document.registration.contact;  
    
    if(fname_validation(fname)) 
    {
    if(lname_validation(lname))  
    {        
    if(ValidateEmail(email))  
    {  
    if(ValidateAge(age,18,65))  
    {
    if(sal_Validation(sal))  
    { 
    if(gender_validation(gender))  
    {   
    if(pass_validation(pass,7,12))  
    {     
    if(contact_validation(contact))  
    {  
    }  
    }   
    }  
    }   
    }  
    }  
    }  
    }  
    return false;  
    }  
		    function fname_validation(fname)
		    {   
		    var letters = /^[A-Za-z]+$/;  
		    if(fname.value.match(letters))  
		    {  
		    return true;  
		    }  
		    else  
		    {  
		    alert('firstname must have alphabet characters only');  
		    fname.focus();  
		    return false;  
		    }  
		    }  
		    
		    function lname_validation(lname)
		    {   
		    var letters = /^[A-Za-z]+$/;  
		    if(lname.value.match(letters))  
		    {  
		    return true;  
		    }  
		    else  
		    {  
		    alert('lasttname must have alphabet characters only');  
		    lname.focus();  
		    return false;  
		    }  
		    }  
		    
		    function ValidateEmail(email)  
		    {  
		    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
		    if(email.value.match(mailformat))  
		    {  
		    return true;  
		    }  
		    else  
		    {  
		    alert("You have entered an invalid email address!");  
		    email.focus();  
		    return false;  
		    }  
		    }  
		    
		    function ValidateAge(age,mxx,myy)
		    {
		    	var age1=age.value;
				if(age1 < mxx || age1 >= myy){
					alert("age should be between "+mxx+ " to "+myy);
					age.focus();
					return false;
				}
				return true;
			}
		    
		    function pass_validation(pass,mx,my)
		    {
		    var passid_len = pass.value.length;  
		    if (passid_len == 0 ||passid_len >= my || passid_len < mx)  
		    {  
		    alert("Password should not be empty / length be between "+mx+" to "+my);  
		    pass.focus();  
		    return false;  
		    }  
		    return true;  
		    }  
		    
		    function contact_validation(contact)
		    {   
		    var numbers = /^[0-9]+$/;  
		    if(contact.value.match(numbers) && (contact.value.length==10))  
		    {  
		    return true;  
		    }  
		    else  
		    {  
		    alert('contact code must have numeric characters only and 10 digit ');  
		    contact.focus();  
		    return false;  
		    }  
		    }  
		    </script>
	</form>
	</div>
	</div>
	</div>
</body>
</html>


