<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>Welcome to Dashboard</h2>

    <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
    %>
        <p><%= message %></p>
    <%
        }
    %>
    
    <p>This is a secure area after successful login.</p>
</body>
</html>
