//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Interface Segregation Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------

interface BasicFunctionality {
    void print(); // Method to print
    void scan(); // Method to scan
}

// Interface for advanced functionalities
interface AdvancedFunctionality {
    void fax(); // Method to fax
    void email(); // Method to email
}

// Printer class implementing BasicFunctionality interface
class Printer implements BasicFunctionality {
    // Implementation of print method
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    // Implementation of scan method
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

// MultifunctionPrinter class implementing both BasicFunctionality and AdvancedFunctionality interfaces
class MultifunctionPrinter implements BasicFunctionality, AdvancedFunctionality {
    // Implementation of print method
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    // Implementation of scan method
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    // Implementation of fax method
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    // Implementation of email method
    @Override
    public void email() {
        System.out.println("Emailing...");
    }
}

// Client class using only basic functionalities
class BasicClient {
    private BasicFunctionality basicFunctionality; // Reference to basic functionality

    // Constructor to initialize with basic functionality
    public BasicClient(BasicFunctionality basicFunctionality) {
        this.basicFunctionality = basicFunctionality;
    }

    // Method to perform basic functions
    public void performBasicFunctions() {
        basicFunctionality.print(); // Call print method
        basicFunctionality.scan(); // Call scan method
    }
}

// Client class using advanced functionalities
class AdvancedClient {
    private AdvancedFunctionality advancedFunctionality; // Reference to advanced functionality

    // Constructor to initialize with advanced functionality
    public AdvancedClient(AdvancedFunctionality advancedFunctionality) {
        this.advancedFunctionality = advancedFunctionality;
    }

    // Method to perform advanced functions
    public void performAdvancedFunctions() {
        advancedFunctionality.fax(); // Call fax method
        advancedFunctionality.email(); // Call email method
    }
}

// Main class demonstrating usage of the functionality
public class Main {
    public static void main(String[] args) {
        // Creating objects for BasicClient and AdvancedClient
        BasicClient basicClient = new BasicClient(new Printer());
        AdvancedClient advancedClient = new AdvancedClient(new MultifunctionPrinter());

        // Basic client performing basic functionalities
        basicClient.performBasicFunctions();

        // Advanced client performing advanced functionalities
        advancedClient.performAdvancedFunctions();
    }
}


/*
We have two interfaces: BasicFunctionality for basic printer functionalities (printing and scanning)
 and AdvancedFunctionality for advanced functionalities (faxing and emailing).
There are two classes implementing these interfaces: Printer implements only basic functionalities, 
and MultifunctionPrinter implements both basic and advanced functionalities.
We have client classes: BasicClient and AdvancedClient, each using only the functionalities they need.
 This adheres to ISP as clients are not forced to depend on interfaces they don't use.
In the Main class, we create objects of BasicClient and AdvancedClient, passing appropriate
 implementations of interfaces based on their needs.
*/