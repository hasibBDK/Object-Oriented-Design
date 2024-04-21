// Shape interface
 interface Shape {
    double area();
}

// Rectangle class implementing the Shape interface
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator class responsible for calculating the total area of shapes
 class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}

// Main class demonstrating the usage of Rectangle, Circle, and AreaCalculator classes
 class Main {

    public static void main(String[] args) {
        // Create some shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        // Calculate total area
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        // Output total area
        System.out.println("Total area of shapes: " + totalArea);
    }
}
