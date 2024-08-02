<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<%@ include file="bootstrap.jsp" %>
<style>
body {
    background-image: url('https://firebasestorage.googleapis.com/v0/b/basicproj-images.appspot.com/o/errorpage.jpg?alt=media&token=00b8173f-8b2c-4e2f-9717-0410e616dd66');
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    font-family: Arial, sans-serif;
}

.container {
    background-color: rgba(255, 255, 255, 0.8);
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
    text-align: center;
}

h1 {
    font-size: 48px;
    color: #333;
}

p {
    font-size: 18px;
    color: #666;
}
</style>
</head>
<body>
    <div class="container">
        <h1>Oops! Something went wrong.</h1>
        <p>An error occurred. Please try again later or contact support.</p>
        <a href="register.jsp" class="btn btn-primary">Go back to homepage</a>
    </div>
</body>
</html>
