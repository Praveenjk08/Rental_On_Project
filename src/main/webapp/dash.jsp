<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="com.servlet.Dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%User user1=(User)session.getAttribute("user"); 

%>
<h1>Hello dashboard <mark><%=user1.getFullname() %></mark></h1>
<h2>

</h2>
<a href="adminreg.jsp">Admin</a>
<a href="userdetails.jsp">UserDetails</a>
</body>
</html>