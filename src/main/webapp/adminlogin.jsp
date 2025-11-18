<%--<%@page import="com.servlet.Dto.Admin"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="adminlog" method="post">
<input type="email" placeholder="Enter your email" name="aname" required>
<input type="password" placeholder="Enter the password" name="apass" >
<button type="submit">AdminLogin</button>
</form>



</body>
</html>