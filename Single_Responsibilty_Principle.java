//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------


/**
 * Represents an employee with name, ID, and salary.
 */
public class Employee {

    /** The name of the employee. */
    private String name;

    /** The ID of the employee. */
    private String id;

    /** The salary of the employee. */
    private double salary;

    /**
     * Constructs an Employee object with the specified name, ID, and salary.
     *
     * @param name The name of the employee.
     * @param id The ID of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the ID of the employee.
     *
     * @return The ID of the employee.
     */
    public String getId() {
        return id;
    }

    /**
     * Retrieves the salary of the employee.
     *
     * @return The salary of the employee.
     */
    public double getSalary() {
        return salary;
    }
}

/**
 * Formats employee data into a string.
 */
public class EmployeeFormatter {

    /**
     * Formats employee data into a string.
     *
     * @param employee The employee object to format.
     * @return A string containing the formatted employee data.
     */
    public String formatEmployeeData(Employee employee) {
        return "Name: " + employee.getName() + ", ID: " + employee.getId() + ", Salary: " + employee.getSalary();
    }
}

/**
 * Main class containing the main method to demonstrate usage of the classes.
 */
public class Main {

    /**
     * Main method to demonstrate usage of the classes.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an employee object with name "John Doe", ID "EMP001", and salary 50000.0
        Employee employee = new Employee("John Doe", "EMP001", 50000.0);

        // Create an instance of EmployeeFormatter to format employee data
        EmployeeFormatter formatter = new EmployeeFormatter();
        // Call the formatEmployeeData method to format employee data and store the result in formattedData variable
        String formattedData = formatter.formatEmployeeData(employee);
        // Print the formatted employee data
        System.out.println("Formatted Employee Data: " + formattedData);
    }
}


/*
 * 
 * Employee class represents an employee and holds employee data.
EmployeeFormatter class is responsible for formatting employee data.
Main class contains the main method where we create an employee object,

 */