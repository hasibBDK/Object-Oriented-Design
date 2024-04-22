/-------------------------------------------------------------------------
//Title : A java programme to demonstrate Dependency Inversion Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------

/**
 * Interface representing a device.
 */
interface Device {
    /**
     * Turns on the device.
     */
    void turnOn(); // Method to turn on the device

    /**
     * Turns off the device.
     */
    void turnOff(); // Method to turn off the device
}

/**
 * Concrete implementation of a light bulb.
 */
class LightBulb implements Device {
    /**
     * Turns on the light bulb.
     */
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Turning on...");
    }

    /**
     * Turns off the light bulb.
     */
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Turning off...");
    }
}

/**
 * Concrete implementation of a fan.
 */
class Fan implements Device {
    /**
     * Turns on the fan.
     */
    @Override
    public void turnOn() {
        System.out.println("Fan: Turning on...");
    }

    /**
     * Turns off the fan.
     */
    @Override
    public void turnOff() {
        System.out.println("Fan: Turning off...");
    }
}

/**
 * High-level module representing a switch.
 */
class Switch {
    /** Reference to the device controlled by the switch. */
    private Device device;

    /**
     * Constructs a switch with a device.
     *
     * @param device The device controlled by the switch.
     */
    public Switch(Device device) {
        this.device = device;
    }

    /**
     * Turns on the device.
     */
    public void turnOn() {
        device.turnOn(); // Call turnOn method of the device
    }

    /**
     * Turns off the device.
     */
    public void turnOff() {
        device.turnOff(); // Call turnOff method of the device
    }
}

/**
 * Main class demonstrating the usage of switches to control devices.
 */
public class Main {
    /**
     * Main method.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Using a switch to control a light bulb
        Device lightBulb = new LightBulb(); // Create a light bulb device
        Switch lightBulbSwitch = new Switch(lightBulb); // Create a switch for the light bulb
        lightBulbSwitch.turnOn(); // Turn on the light bulb
        lightBulbSwitch.turnOff(); // Turn off the light bulb

        // Using a switch to control a fan
        Device fan = new Fan(); // Create a fan device
        Switch fanSwitch = new Switch(fan); // Create a switch for the fan
        fanSwitch.turnOn(); // Turn on the fan
        fanSwitch.turnOff(); // Turn off the fan
    }
}




/**
 * We have an interface Device representing a device with methods to turn it on and off.
 * LightBulb and Fan are concrete implementations of the Device interface.
 * Switch is a high-level module representing a switch that can turn a device on and off. 
 * It depends on the Device abstraction rather than concrete implementations.
 * In the Main class, we demonstrate how a switch can be used to control both a 
 * light bulb and a fan without directly depending on their concrete implementations.
 * This adheres to the Dependency Inversion Principle.
 */

 