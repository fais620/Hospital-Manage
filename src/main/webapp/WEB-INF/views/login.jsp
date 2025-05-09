<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>

    <form action="/login" method="post">
        <label for="email">Email:</label><br/>
        <input type="text" id="email" name="email" required><br/><br/>

        <label for="password">Password:</label><br/>
        <input type="password" id="password" name="password" required><br/><br/>

        <input type="submit" value="Login">
    </form>

    <br/>

    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <p style="color: red;"><%= error %></p>
    <%
        }
    %>
</body>
</html>
