<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    
    <link rel="stylesheet" href="dashboard.css">
    <script src="dashboard.js"></script>
    <script src="Logout.js"></script>
     
    <link rel="icon" type="image/png" href="images/library1.png">
    
</head>

<body>

    <header class="dashboard-header">
        <div class="header-content">
            <h1>ADMIN DASHBOARD</h1>
            <h5>Welcome, <span class="admin-name"><%= session.getAttribute("session_name") %></span></h5>
            <a href="Logincard.jsp" class="logout-button">Logout</a>
        </div>
    </header>
    
       

    <div class="card-container">
        <div class="card">
            <p></p>
            <a href="Add.jsp" class="card-link"></a>
        </div>

        
        <div class="card">
            <p></p>
            <a href="Updated.jsp" class="card-link"></a>
        </div>

        <div class="card">
            <p></p>
            <a href="Delete.jsp" class="card-link"></a>
        </div>
        
        <div class ="card">
            <p></p>
            <a href="Borrow.jsp" class="card-link"></a>  
        </div>
        
        <div class ="card">
            <p></p>
            <a href="Return.jsp" class="card-link"></a>  
        </div>
        
             
    </div>
    
    
    <div class="cards-container">
        <div class="cards">
            <p>Logout</p>
              <a href="Logincard.jsp" class="card-link" onclick="return handleLogout()">LOGOUT BUTTON!</a>
        </div>
    </div>
    
    
  
	<script>
		
	var message = "<%= request.getAttribute("message") %>";
	var messageType = "<%= request.getAttribute("messageType") %>";   

	function showAlert(message, messageType) {
	        if (messageType === "success") {
	            alert(" Success: " + message);
	        } else if (messageType === "error") {
	            alert(" Error: " + message);
	        }
	    }

	    if (message && messageType) {
	        showAlert(message, messageType);
	    }
		
	<script>
    
    
</body>

</html>