package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.employee;
import services.employeeservice;

@WebServlet("/register")

public class employeeservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String firstName = req.getParameter("firstName");
    	String lastName = req.getParameter("lastName");
    	String department = req.getParameter("department");
    	String position = req.getParameter("position");
    	double salary = Double.parseDouble(req.getParameter("salary"));

    	employee emp = new employee(0, firstName, lastName, department, position, salary); // Assuming auto-increment id

    	try {
    	    employeeservice service = new employeeservice();
    	    boolean success = service.addEmployee(emp);

    	    if (success) {
    	        resp.sendRedirect("welcome.jsp");
    	    } else {
    	        resp.sendRedirect("error.jsp"); // Redirect to error page on failure
    	    }
    	} catch (SQLException e) {
    	    // Handle database exception
    	    e.printStackTrace(); // For logging or debugging
    	    resp.sendRedirect("error.jsp"); // Redirect to error page on exception
    	}
    }
}
