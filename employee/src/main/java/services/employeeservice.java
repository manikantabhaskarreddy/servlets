package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.employee;
import dbconnections.employeedb;

public class employeeservice {

    private Connection conn;

    public employeeservice() throws SQLException {
        this.conn = employeedb.getConnection();  // Get connection from employeedb class
    }

    public boolean addEmployee(employee employee) throws SQLException {
        boolean success = false;
        try {
            String sql = "INSERT INTO employee (first_name, last_name, department, position, salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getDepartment());
            pstmt.setString(4, employee.getPosition());
            pstmt.setDouble(5, employee.getSalary());

            int rowsAffected = pstmt.executeUpdate();
            success = rowsAffected > 0;

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return success;
    }

    public List<employee> fetchAllEmployees() throws SQLException {
        List<employee> employeeList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM employee";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                employee employee = new employee(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("department"),
                        rs.getString("position"),
                        rs.getDouble("salary")
                );
                employeeList.add(employee);
            }

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return employeeList;
    }

    public employee getById(int id) throws SQLException {
        employee employee = null;
        try {
            String sql = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                employee = new employee(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("department"),
                        rs.getString("position"),
                        rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return employee;
    }

    public employee getByEmail(String email) throws SQLException {
        employee employee = null;
        try {
            String sql = "SELECT * FROM employee WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, email);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                employee = new employee(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("department"),
                        rs.getString("position"),
                        rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return employee;
    }

    public boolean deleteByEmail(String email) throws SQLException {
        boolean success = false;
        try {
            String sql = "DELETE FROM employee WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, email);

            int rowsAffected = pstmt.executeUpdate();
            success = rowsAffected > 0;

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return success;
    }

    public boolean deleteEmployee(int id) throws SQLException {
        boolean success = false;
        try {
            String sql = "DELETE FROM employee WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            success = rowsAffected > 0;

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return success;
    }

    public boolean updateEmployee(employee employee) throws SQLException {
        boolean success = false;
        try {
            String sql = "UPDATE employee SET first_name = ?, last_name = ?, department = ?, position = ?, salary = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, employee.getFirstName());
            pstmt.setString(2, employee.getLastName());
            pstmt.setString(3, employee.getDepartment());
            pstmt.setString(4, employee.getPosition());
            pstmt.setDouble(5, employee.getSalary());


            int rowsAffected = pstmt.executeUpdate();
            success = rowsAffected > 0;

        } catch (SQLException e) {
            throw e;  // Re-throw the SQLException for better error handling
        } finally {
            employeedb.closeConnection();  // Close connection after use
        }
        return success;
    }
}
