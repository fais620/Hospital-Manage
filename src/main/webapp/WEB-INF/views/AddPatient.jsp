<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Management System</title>
    <link rel="stylesheet" href="AddPatient.css">
</head>
<body>

    <div class="form-card">
        <header>
            <h2>Add Patient Details</h2>
        </header>

        <form action="/Patients/addingPatient" method="post">
            <label for="patientId"><strong>ID of the Patient</strong></label>
            <input type="text" id="patientId" name="patientId"><br><br>

            <label for="patientName"><strong>Name of the Patient</strong></label><br>
            <input type="text" id="patientName" name="patientName"><br><br>

            <label for="patientAge">Age of the Patient</label><br>
            <input type="number" id="patientAge" name="patientAge"><br><br>

            <label for="patientGender">Gender of the Patient</label><br>
            <input type="text" id="patientGender" name="patientGender"><br><br>

            <label for="patientEmail">Email Id of the Patient</label><br>
            <input type="text" id="patientEmail" name="patientEmail"><br><br>

            <label for="patientPhoneNum">Phone Number of the Patient</label><br>
            <input type="text" id="patientPhoneNum" name="patientPhoneNum"><br><br>

            <label for="patientAddress">Address of the Patient:</label><br>
            <input type="text" id="patientAddress" name="patientAddress"><br><br>

            <button type="submit">Submit</button>
        </form>
    </div>

    <script type="text/javascript">
        // Get the session attributes passed through request attributes
        var successMessage = "${successMessage}";
        var errorMessage = "${errorMessage}";

        // Display success or error messages in a pop-up
        if (successMessage) {
            alert("Success: " + successMessage);
            // Optionally, you can redirect to remove the message after displaying it
            // window.location.href = '/AddPatient'; // Uncomment this line if you want to refresh the page after showing the message
        }

        if (errorMessage) {
            alert("Error: " + errorMessage);
            // Optionally, you can redirect to remove the message after displaying it
            // window.location.href = '/AddPatient'; // Uncomment this line if you want to refresh the page after showing the message
        }
    </script>

</body>
</html>
