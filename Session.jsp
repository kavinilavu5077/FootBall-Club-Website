<%@ page import="com.cont.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Page</title>
</head>
<body>
<div id = "stylo" ><center>
<a href="Session.jsp">NextPage</a>

<h2>THIS IS SESSION PAGE</h2>
<%
User u =(User)session.getAttribute("data");%>
<h2>hi <%= u.getName() %></h2>
Your age is <input type="text" value="<%= u.getAge() %>"><br><br>
<p>Your address is</p>
<address><%= u.getAddress() %></address>
</center>
</div>

</body>
</html>