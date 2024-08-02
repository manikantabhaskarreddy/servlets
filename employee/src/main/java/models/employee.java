package models;

public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private double salary;

    public employee(int employeeId, String firstName, String lastName, String department, String position, double salary) {

        this.id = employeeId;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDepartment(department);
        this.setPosition(position);
        this.salary = salary;
    }

    public int getEmployeeId() {
        return id;
    }
    
    public void setEmployeeId(int employeeId) {
		this.id = employeeId;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            throw new IllegalArgumentException("Department cannot be null or empty");
        }
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty");
        }
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
