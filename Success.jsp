<%@ page import="com.cont.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>
<center>
<a href="Session.jsp">NextPage</a>
<%
User u =(User)request.getAttribute("data");%>
<h2>hi <%= u.getName() %></h2>
Your age is <input type="text" value="<%= u.getAge() %>"><br><br>
<p>Your address is</p>
<address>  <%= u.getAddress() %> </address>


</center>
</body>
</html>