<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Hospital_Manage.modelentity.Patients" %>
<html>
<head><title>Patient List</title></head>
<body>
    <h2>List of All Patients</h2>
    <table border="1">
        <tr>
            <th>Patient ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <%  
            List<Patients> patients = (List<Patients>) request.getAttribute("patients");
            if (patients != null) {
                for (Patients patient : patients) {
        %>
        <tr>
            <td><%= patient.getPatientId() %></td>
            <td><%= patient.getName() %></td>
            <td><%= patient.getAge() %></td>
            <td><%= patient.getGender() %></td>
            <td><%= patient.getPhone() %></td>
            <td><%= patient.getEmail() %></td>
            <td><%= patient.getAddress() %></td>
        </tr>
        <% 
                }
            } else {
        %>
        <tr>
            <td colspan="7">No patient data available.</td>
        </tr>
        <% 
            }
        %>
    </table>
</body>
</html>

