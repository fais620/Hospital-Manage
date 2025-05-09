

function validateForm() {
	const myId   =       document.getElementById("patientId").value
    const myName =       document.getElementById("patientName").value;
    const myAge  =       document.getElementById("patientAge").value;
    const myGender =     document.getElementById("patientGender").value;
    const myEmail =      document.getElementById("patientEmail").value;
    const myPhone =      document.getElementById("patientPhone").value;
	const myAddress =    document.getElementById("patientAddress").value;
	

	if (myId === "" || myName === "" || myAge === "" || myGender === "" || myEmail === "" || myPhone === "" || myAddress === "") {
	      alert("All fields must be filled out.");
		  
	      return false;
	  }
	  
	 
	  
	  
	  const namePattern =  /^[A-Za-z]+(?: [A-Za-z]+)?$/
	  if(!namePattern.test(myName)){
	  alert("Patient Name must contain only letters with no spaces.");
	      return false;
		  
		  }
		  
	  const addressPattern =  /^[A-Za-z]+(?: [A-Za-z]+)?$/
	  if(!addressPattern.test(myAddress)){
		alert("Address should contain only alphabetic letter with no spaces");
		
	  }
	  
	  
	  const phonePattern = /^\d{10}$/;
	    if (!phonePattern.test(myPhone)) {
	        alert("Phone number must be exactly 10 digits.");
	       return false;
	    }
		
		
	  const emailPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d._%+-]+@[A-Za-z\d.-]+\.[A-Za-z]{2,}$/; 
		if(!emailPattern.test(myEmail)){
			alert("Email id should match the following Pattern.");
			return false;
		}
		

		return true;

			 
		 }
	