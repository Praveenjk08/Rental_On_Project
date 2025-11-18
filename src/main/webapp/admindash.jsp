<%@page import="com.servlet.Dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Admin admin=(Admin)session.getAttribute("admin");%>
<h1>Admin Page</h1>
<h2>Welcome The king admin,<%=admin.getAdmin_Fullname()%></h2>
<a href="viewuser">Employee</a>
</body>
</html>