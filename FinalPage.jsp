<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie Information</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        padding: 20px;
        text-align: center;
    }

    .cookie-container {
        max-width: 600px;
        margin: 20px auto;
        background-color: #fff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        text-align: left;
    }

    .cookie-info {
        margin-bottom: 10px;
    }

    .cookie-name {
        font-weight: bold;
        color: #333;
    }

    .cookie-value {
        color: #666;
    }
</style>
</head>
<body>

<div class="cookie-container">
    <h2>Cookie Information</h2>
    <% 
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
    %>
    <div class="cookie-info">
        <span class="cookie-name">Name:</span> <%= cookie.getName() %><br>
        <span class="cookie-value">Value:</span> <%= cookie.getValue() %>
    </div>
    <% 
        }
    } else {
    %>
    <p>No cookies found.</p>
    <% } %>
</div>

</body>
</html>
