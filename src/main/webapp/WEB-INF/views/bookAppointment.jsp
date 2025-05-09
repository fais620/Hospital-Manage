<%@ page import="java.util.List" %>
<%@ page import="com.example.Hospital_Manage.modelentity.Patients" %>
<%@ page import="com.example.Hospital_Manage.modelentity.Doctor" %>

<%
  
    String success = (String) session.getAttribute("success");
    String error = (String) session.getAttribute("error");

    
    if (success != null) {
%>
        <script>
            alert("<%= success %>");
        </script>
<%
        session.removeAttribute("success");  
    }

   
    if (error != null) {
%>
        <script>
            alert("<%= error %>");
        </script>
<%
        session.removeAttribute("error");  
    }
%>

<%
    
    List<Patients> patients = (List<Patients>) request.getAttribute("patients");
    List<Doctor> doctors = (List<Doctor>) request.getAttribute("doctors");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Appointment</title>
</head>
<body>

<h2>Book an Appointment</h2>

<form action="bookAppointment" method="post">
    <label>Patient:</label>
    <select name="patient.patientId" required>
        <% if (patients != null) {
               for (Patients p : patients) { %>
            <option value="<%= p.getPatientId() %>"><%= p.getPatientName() %></option>
        <%     }
           } else { %>
            <option disabled>No patients available</option>
        <% } %>
    </select><br><br>

    <label>Doctor:</label>
    <select name="doctor.doctorid" required>
        <% if (doctors != null) {
               for (Doctor d : doctors) { %>
				<option value="<%= d.getDoctorid() %>"><%= d.getDoctorname() %></option>
        <%     }
           } else { %>
            <option disabled>No doctors available</option>
        <% } %>
    </select><br><br>

    <label>Date:</label>
    <input type="date" name="appointmentDate" required><br><br>

    <label>Remarks:</label>
    <input type="text" name="remarks" required><br><br>

    <input type="submit" value="Book Appointment">
</form>

</body>
</html>


