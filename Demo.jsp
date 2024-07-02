<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 20px;
    padding: 20px;
    text-align: center;
  }
  .container {
    max-width: 600px;
    margin: auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  h1 {
    color: #333;
  }
  p {
    color: #666;
    line-height: 1.6;
  }
  /* Additional styles for specific elements can be added here */
</style>
</head>
<body>
  <div class="container">
    <%!
      String name = "";
      public String getDetails() {
        return "Name: " + name;
      }
    %>
    <%
      name = request.getParameter("name").trim();
      out.println("<h1>Hello, " + name + "!</h1>");
      out.println("<p>" + getDetails() + "</p>");
    %>
  </div>
</body>
</html>
