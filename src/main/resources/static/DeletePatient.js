

  

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


