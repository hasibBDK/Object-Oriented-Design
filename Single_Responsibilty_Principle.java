//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Single Responsibility Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------


public class Employee {

    // Private instance variables for employee's name, id, and salary
    private String name;
    private String id;
    private double salary;

    // Constructor to initialize the Employee object with provided values
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter method for retrieving the employee's name
    public String getName() {
        return name;
    }

    // Getter method for retrieving the employee's ID
    public String getId() {
        return id;
    }

    // Getter method for retrieving the employee's salary
    public double getSalary() {
        return salary;
    }
}


// Definition of the EmployeeFormatter class
public class EmployeeFormatter {

    // Method to format employee data as a string
    public String formatEmployeeData(Employee employee) {
        return "Name: " + employee.getName() + ", ID: " + employee.getId() + ", Salary: " + employee.getSalary();
    }
}

// Main class containing the main method to demonstrate usage of the classes
public class Main {

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