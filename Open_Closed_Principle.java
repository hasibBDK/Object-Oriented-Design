//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Open Closed Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//------------------------------------------------------------------------

public interface Shape {
    double area(); // Method to calculate the area of a shape
}

// Rectangle class implementing the Shape interface
public class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height of the rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the area method to calculate the area of the rectangle
    @Override
    public double area() {
        return width * height;
    }
}

// Circle class implementing the Shape interface
public class Circle implements Shape {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator class responsible for calculating the total area of shapes
public class AreaCalculator {
    // Method to calculate the total area of an array of shapes
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area(); // Add the area of each shape to the total area
        }
        return totalArea; // Return the total area
    }
}

// Main class demonstrating the usage of Rectangle, Circle, and AreaCalculator classes
public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4); // Create a rectangle shape
        shapes[1] = new Circle(3); // Create a circle shape

        // Calculate total area
        AreaCalculator calculator = new AreaCalculator(); // Create an instance of the AreaCalculator class
        double totalArea = calculator.calculateTotalArea(shapes); // Calculate the total area of the shapes

        // Output total area
        System.out.println("Total area of shapes: " + totalArea); // Print the total area of the shapes
    }
}




/*Shape interface: Defines a contract for shapes to implement a method area() to calculate their area.
Rectangle class: Implements the Shape interface and provides a method to calculate the area of
 a rectangle based on its width and height.
Circle class: Also implements the Shape interface and provides a method to calculate the area 
of a circle based on its radius.
AreaCalculator class: Contains a method calculateTotalArea() which takes an array of Shape 
objects and iterates through them, calculating the total area by calling the area() method for each shape.
Main class: Demonstrates the usage of the Rectangle, Circle, and AreaCalculator classes.
 It creates instances of rectangle and circle shapes, adds them to an array of shapes, 
calculates the total area using AreaCalculator, and prints the result.*/