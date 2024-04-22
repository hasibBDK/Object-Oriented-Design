//-------------------------------------------------------------------------
//Title : A java programme to demonstrate Liskov Substitution Principle.
// Author : Hasibur Rahaman,Student Id : 220227
//Undergrduate student, Khulna University.
//-------------------------------------------------------------------------

/**
 * Class representing a rectangle.
 */
class Rectangle {
    /** Width of the rectangle. */
    protected int width;

    /** Height of the rectangle. */
    protected int height;

    /** Default constructor. */
    public Rectangle() {}

    /**
     * Constructor to initialize the rectangle with given width and height.
     *
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(int width, int height) {
        this.width = width; // Initialize width
        this.height = height; // Initialize height
    }

    /**
     * Getter method for retrieving the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public int getWidth() {
        return width; // Return width
    }

    /**
     * Setter method to set the width of the rectangle.
     *
     * @param width The width to set.
     */
    public void setWidth(int width) {
        this.width = width; // Set width
    }

    /**
     * Getter method for retrieving the height of the rectangle.
     *
     * @return The height of the rectangle.
     */
    public int getHeight() {
        return height; // Return height
    }

    /**
     * Setter method to set the height of the rectangle.
     *
     * @param height The height to set.
     */
    public void setHeight(int height) {
        this.height = height; // Set height
    }

    /**
     * Method to calculate the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public int getArea() {
        return width * height; // Calculate and return area
    }
}

/**
 * Class representing a square, extending Rectangle.
 */
class Square extends Rectangle {
    /** Default constructor. */
    public Square() {}

    /**
     * Constructor to initialize the square with given size.
     *
     * @param size The size of the square.
     */
    public Square(int size) {
        width = size; // Set width as size
        height = size; // Set height as size
    }

    /**
     * Override the setWidth method to ensure square properties are maintained.
     *
     * @param width The width to set.
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width); // Set width of square
        super.setHeight(width); // Set height of square
    }

    /**
     * Override the setHeight method to ensure square properties are maintained.
     *
     * @param height The height to set.
     */
    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Set width of square
        super.setHeight(height); // Set height of square
    }
}

/**
 * Main class demonstrating the usage of Rectangle and Square classes.
 */
public class Main {
    /**
     * Method to demonstrate using a rectangle.
     *
     * @param r The rectangle to use.
     */
    static void useRectangle(Rectangle r) {
        int width = r.getWidth(); // Get the width of the rectangle
        r.setHeight(10); // Set the height of the rectangle to 10
        // Print the expected and actual area of the rectangle
        System.out.println("Expected area = " + (width * 10) + ", Actual area = " + r.getArea());
    }

    /**
     * Main method.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 5); // Create a rectangle with width 5 and height 5
        useRectangle(rect); // Expected area = 50, Actual area = 50

        Rectangle square = new Square(5); // Create a square with size 5
        useRectangle(square); // Expected area = 50, Actual area = 100
    }
}

/**
 * We have a Rectangle class with width and height properties, along with methods to get 
 * and set these properties. It also has a method to calculate the area.
 * Square class extends Rectangle. Since a square is a special case of a
 * rectangle where all sides are equal, we override the setters to ensure 
 * both width and height remain the same.
 * In the Main class, we have a method useRectangle that takes a Rectangle as input, sets its height to 10, 
 * and calculates the area based on the new height. However, when we pass a Square object to this method, it
 * doesn't behave as expected because modifying the height also changes the width, violating the LSP.
 */


