
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--<% User user=(User)session.getAttribute("user"); %> --%>
<form action="adminreg" method="post">
<%-- <input type="number" value="<%=user.getUid()%>" readonly> --%>
<input type="text" placeholder="Enter your name" name="aname" required>
<input type="email" placeholder="Enter your email" name="aemail" required>
<input type="password" placeholder="Enter your password" name="apass" required>
<input type="tel" placeholder="Enter your Phone-Number" name="aph" required>
<input type="date" value="<%=java.time.LocalDate.now()%>" readonly name="adate">
<button type="submit">AdminRgistaion</button>
</form>

</body>
</html>