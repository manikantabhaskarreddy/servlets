<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="models.employee" %>
<%@ page import="java.util.List" %>
<%@ page import="dbconnections.employeedb" %>
<%@ page import="services.employeeservice" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<%@ include file="bootstrap.jsp" %>
<style>
body {
    background-image: url('https://firebasestorage.googleapis.com/v0/b/basicproj-images.appspot.com/o/welcome.png?alt=media&token=5efbd8e9-8330-4b58-9369-85b1070dfbe3'); 
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
}

table {
    background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white background */
}

/* Style the title with white color and black shadow */
h1 {
    color: white;
    text-shadow: 1px 1px 2px black;
}
</style>
</head>
<body>
    <div class="container">
        <h1>Employee List</h1>
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Department</th>
                    <th>Position</th>
                    <th>Salary</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    employeeservice service = new employeeservice();
                    List<employee> employees = service.fetchAllEmployees();

                    for (employee emp : employees) {
                %>
                <tr>
                    <th scope="row"><%=emp.getEmployeeId()%></th>
                    <td><%= emp.getFirstName() %></td>
                    <td><%= emp.getLastName() %></td>
                    <td><%= emp.getDepartment() %></td>
                    <td><%= emp.getPosition() %></td>
                    <td><%= emp.getSalary() %></td>
                    <td>
                        <a href="editEmployee?id=<%= emp.getEmployeeId() %>" class="btn btn-primary">Edit</a>
                        <a href="deleteEmployee?id=<%= emp.getEmployeeId() %>" class="btn btn-danger">Delete</a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>
