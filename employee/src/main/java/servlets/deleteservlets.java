package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.employeeservice;

@WebServlet("/deleteEmployee")
public class deleteservlets extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		try {
		    employeeservice service = new employeeservice();
		    boolean success = service.deleteEmployee(id);

		    if (success) {
		        // Handle successful deletion
		        resp.sendRedirect("welcome.jsp");
		    } else {
		        // Handle deletion failure
		        // You can display a specific error message or redirect to an error page
		        resp.sendRedirect("error.jsp");
		    }
		} catch (SQLException e) {
		    // Handle database exception
		    e.printStackTrace(); // For logging
		    // Display error message to the user
		    // Redirect to an error page
		}

	}
}
