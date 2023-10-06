package InheritanceAssignment;

class Shape {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    @Override
    void printShape() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    @Override
    void printShape() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    @Override
    void printShape() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle {
    @Override
    void printShape() {
        System.out.println("Square is a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.printShape();

        Polygon polygon = new Polygon();
        polygon.printShape();

        Rectangle rectangle = new Rectangle();
        rectangle.printShape();

        Triangle triangle = new Triangle();
        triangle.printShape();

        Square square = new Square();
        square.printShape();
    }
}
