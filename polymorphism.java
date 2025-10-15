// Base class Shape
class Shape {
    // Default area method
    double area() {
        System.out.println("Area of shape is not defined.");
        return 0;
    }

    // Overloaded area method with two parameters (for rectangle)
    double area(double length, double width) {
        return length * width;
    }

    // Overloaded area method with one parameter (for circle)
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
}

// Circle class inherits Shape and overrides area()
class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }

    // Override area method without parameters
    @Override
    double area() {
        return 3.1416 * radius * radius;
    }
}

// Rectangle class inherits Shape and overrides area()
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method without parameters
    @Override
    double area() {
        return length * width;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(5, 8);

        // Using overridden methods
        System.out.println("Circle area (override): " + circle.area());
        System.out.println("Rectangle area (override): " + rectangle.area());

        // Using overloaded methods from Shape class
        System.out.println("Circle area (overload): " + shape.area(7));
        System.out.println("Rectangle area (overload): " + shape.area(5, 8));

        // Using default area method from Shape
        System.out.println("Default shape area: " + shape.area());
    }
}
