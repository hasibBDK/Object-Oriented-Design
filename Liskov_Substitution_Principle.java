//-------------------------------------------------------------------------
//Title : A java programme to Liskov Substitution Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------


/**
 * Interface representing a shape.
 */
interface Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    double area();
}

/**
 * Class representing a rectangle.
 */
class Rectangle implements Shape {
    /** Width of the rectangle. */
    private double width;

    /** Height of the rectangle. */
    private double height;

    /**
     * Constructs a rectangle with the given width and height.
     *
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     *
     * @param width The width to set.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the rectangle.
     *
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle.
     *
     * @param height The height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double area() {
        return width * height;
    }
}

/**
 * Class representing a square, which is a special case of a rectangle.
 */
class Square implements Shape {
    /** Length of the side of the square. */
    private double sideLength;

    /**
     * Constructs a square with the given side length.
     *
     * @param sideLength The length of the side of the square.
     */
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Gets the side length of the square.
     *
     * @return The side length of the square.
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Sets the side length of the square.
     *
     * @param sideLength The side length to set.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Calculates the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    public double area() {
        return sideLength * sideLength;
    }
}

/**
 * Main class to demonstrate the usage of shapes.
 */
public class Main {
    /**
     * Calculates and prints the area of a shape.
     *
     * @param shape The shape for which to calculate the area.
     */
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    /**
     * Main method.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        printArea(rectangle); // Output: Area: 50

        Square square = new Square(5);
        printArea(square); // Output: Area: 25
    }
}


/**
 * In this example, both Rectangle and Square implement the Shape interface, which specifies
 *  a common behavior for calculating the area of a shape. The Square class is a subclass of 
 * the Rectangle class, but it does not override any behavior of its superclass. Instead, it 
 * provides its own implementation of the area calculation that is specific to a square. When 
 * used polymorphically, objects of both Rectangle and Square classes can be substituted
 *  interchangeably without affecting the correctness of the program, thus adhering to the 
 * Liskov Substitution Principle.
 */