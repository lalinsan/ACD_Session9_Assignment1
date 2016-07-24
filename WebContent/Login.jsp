<!-- Login Page where User Enter Login Credentials  -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<font color="red"> ${requestScope.error}</font> <!-- Display a message when User Name or Password are incorrect -->
	<form action="ValidatePassword" method="POST">
	User Name : 
	<input type="text" name="userName"/> <!-- Prompts user to enter User Name -->
	Password :
	<input type="password" name="password"/> <!-- Prompts user to enter Password -->
	<input type="Submit"/> <!-- Send form and calls Validate Password Servlet -->
	</form>

</body>