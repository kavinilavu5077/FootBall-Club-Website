<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resgistration form</title>
</head>
<body>

<%
List<String> li=(List<String>)request.getAttribute("errors");
if(li!=null)
{
Iterator<String> itr=li.iterator();
%>


<ul>

<%while(itr.hasNext()){ %>
<li><%=itr.next() %></li>

<% } %>
</ul>
<% } %>


<center>
<h1> Registeration details</h1>
<form action="RegisterController" method="post">
Name <input type="text" name="name"/><br><br>
Age<input type="text" name="age" value="0"/><br><br>
Gender <br>
<input type="radio" name="gender" value="Male">Male<br>
<input type="radio" name="gender" value="FeMale">Female<br><br>

Address <textarea rows="5 cols="7" name="addr"></textArea><br><br>
 <input type="submit" value="submit"/><br><br>

</form>
</center>

</body>
</html>