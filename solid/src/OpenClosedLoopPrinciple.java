
/*
* Software entities should be open for extension, but closed for modification
*
* */

public class OpenClosedLoopPrinciple {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);

        AreaCalculator calculator = new AreaCalculator(circle);
        System.out.println("Area: "  + calculator.calculate());

        AreaCalculator calculator2 = new AreaCalculator(rectangle);
        System.out.println("Rectangular Area: "  + calculator2.calculate());
    }
}


interface Shape {
    double area();
}

class Circle implements Shape {
    private final int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private final int breadth;
    private final int height;

    public Rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    public double area() {
        return breadth * height;
    }
}

class AreaCalculator {
    private final Shape shape;

    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public double calculate() {
        return shape.area();
    }
}
