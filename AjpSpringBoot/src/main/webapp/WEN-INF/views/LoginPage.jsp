<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<form:form action ="login/autheticate" modelAttribute="loginPage">
<center>
<h2>Welcome to login page
	</h2>
<table border="2">
<tr>
<td colspan="2">Login page</td>
</tr>
<tr>
<td> Enter Login id:</td>
</tr>
<tr><td> Enter the password </td></tr>
<tr><td><input type="submit" value ="login"></td>
<td><input type ="reset" value="reset"></td>
</table>
</center>
</form:form>
</body>
</html>