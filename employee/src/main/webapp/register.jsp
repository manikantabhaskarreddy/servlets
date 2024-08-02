<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
<%@include file="bootstrap.jsp" %>
<style>
body {
    background-image: url('https://firebasestorage.googleapis.com/v0/b/basicproj-images.appspot.com/o/Gemini_Generated_Image_asyld6asyld6asyl.jpeg?alt=media&token=d845176c-80a4-4aaf-9bf8-5ee9e50e805d');
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background-color: rgba(255, 255, 255, 0.8);
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
}

::placeholder {
    color: white;
}
</style>
</head>
<body>
    <div class="container">
        <h1>Employee Registration</h1>
        <form action="register" method="post">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required placeholder="Enter first name">
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required placeholder="Enter last name">
            </div>
            <div class="form-group">
                <label for="department">Department:</label>
                <input type="text" class="form-control" id="department" name="department" required placeholder="Enter department">
            </div>
            <div class="form-group">
                <label for="position">Position:</label>
                <input type="text" class="form-control" id="position" name="position" required placeholder="Enter position">
            </div>
            <div class="form-group">
                <label for="salary">Salary:</label>
                <input type="number" class="form-control" id="salary" name="salary" required placeholder="Enter salary">
            </div>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>
</body>
</html>
