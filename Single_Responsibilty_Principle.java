            ///single repository principle\\\


public class  Employee{

    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDatabaseManager {

    public void saveEmployeeData(Employee employee) {
        // Simulating saving employee data to the database
        System.out.println("Saving employee data to the database: " + employee.getName());
    }
}

public class EmployeeFormatter {

    public String formatEmployeeData(Employee employee) {
        // Format employee data as required
        return "Name: " + employee.getName() + ", ID: " + employee.getId() + ", Salary: " + employee.getSalary();
    }
}

public class Main {

    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John Doe", "EMP001", 50000.0);

        // Save employee data
        EmployeeDatabaseManager databaseManager = new EmployeeDatabaseManager();
        databaseManager.saveEmployeeData(employee);

        // Format employee data
        EmployeeFormatter formatter = new EmployeeFormatter();
        String formattedData = formatter.formatEmployeeData(employee);
        System.out.println("Formatted Employee Data: " + formattedData);
    }
}

/*
 * 
 * Employee class represents an employee and holds employee data.
EmployeeDatabaseManager class is responsible for saving employee data to the database.
EmployeeFormatter class is responsible for formatting employee data.
Main class contains the main method where we create an employee object,
save its data using the EmployeeDatabaseManager, and format its data using the EmployeeFormatter.
 */