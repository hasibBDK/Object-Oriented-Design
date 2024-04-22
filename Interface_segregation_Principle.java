//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Interface Segregation Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------

/**
 * Interface representing basic functionalities of a device.
 */
interface BasicFunctionality {
    /**
     * Performs the print functionality.
     */
    void print(); // Print functionality

    /**
     * Performs the scan functionality.
     */
    void scan(); // Scan functionality
}

/**
 * Interface representing advanced functionalities of a device.
 */
interface AdvancedFunctionality {
    /**
     * Performs the fax functionality.
     */
    void fax(); // Fax functionality

    /**
     * Performs the email functionality.
     */
    void email(); // Email functionality
}

/**
 * Printer class implementing BasicFunctionality interface.
 */
class Printer implements BasicFunctionality {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

/**
 * MultifunctionPrinter class implementing both BasicFunctionality and AdvancedFunctionality interfaces.
 */
class MultifunctionPrinter implements BasicFunctionality, AdvancedFunctionality {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void email() {
        System.out.println("Emailing...");
    }
}

/**
 * Client class using only basic functionalities.
 */
class BasicClient {
    /** Reference to basic functionality. */
    private BasicFunctionality basicFunctionality;

    /**
     * Constructs a BasicClient object with basic functionality.
     *
     * @param basicFunctionality The basic functionality.
     */
    public BasicClient(BasicFunctionality basicFunctionality) {
        this.basicFunctionality = basicFunctionality;
    }

    /**
     * Performs basic functionalities.
     */
    public void performBasicFunctions() {
        basicFunctionality.print();
        basicFunctionality.scan();
    }
}

/**
 * Client class using advanced functionalities.
 */
class AdvancedClient {
    /** Reference to advanced functionality. */
    private AdvancedFunctionality advancedFunctionality;

    /**
     * Constructs an AdvancedClient object with advanced functionality.
     *
     * @param advancedFunctionality The advanced functionality.
     */
    public AdvancedClient(AdvancedFunctionality advancedFunctionality) {
        this.advancedFunctionality = advancedFunctionality;
    }

    /**
     * Performs advanced functionalities.
     */
    public void performAdvancedFunctions() {
        advancedFunctionality.fax();
        advancedFunctionality.email();
    }
}

/**
 * Main class demonstrating the usage of BasicClient and AdvancedClient.
 */
public class Main {
    /**
     * Main method.
     *
     * @param args The command-line arguments (not used in this example).
     */
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


/** 
 * We have two interfaces: BasicFunctionality for basic printer functionalities (printing and scanning)
 * and AdvancedFunctionality for advanced functionalities (faxing and emailing).
 * There are two classes implementing these interfaces: Printer implements only basic functionalities, 
 * and MultifunctionPrinter implements both basic and advanced functionalities.
 * We have client classes: BasicClient and AdvancedClient, each using only the functionalities they need.
 * This adheres to ISP as clients are not forced to depend on interfaces they don't use.
 * In the Main class, we create objects of BasicClient and AdvancedClient, passing appropriate
 * implementations of interfaces based on their needs.
*/