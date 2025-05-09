<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>


<html>

<head><title>Search Patient</title></head>

<body>

    <h2>Search Patient</h2>

    <form action="/search" method="post">

        <label>Enter Patient ID:</label>

        <input type="text" name="id" required>

        <button type="submit">Search</button>

    </form>

    <p style="color:red;">${errorMessage}</p>

</body>

</html>