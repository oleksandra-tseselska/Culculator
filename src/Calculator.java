import OOP.*;

public class Calculator {

    public static void main(String[] args) {
        PartsOfFigures parts = new PartsOfFigures();
        parts.setRadius(5);
        Circle circle = new Circle(parts);
        circle.areaOfShape();

        parts.setSideA(4);
        parts.setSideB(3);
        Rectangle rectangle = new Rectangle(parts);
        rectangle.areaOfShape();

        parts.setSideA(10);
        Square square = new Square(parts);
        square.areaOfShape();

        parts.setSideA(4);
        parts.setSideB(3);
        parts.setSideC(8);
        parts.setRadius(5);
        Triangle triangle = new Triangle(parts);
        triangle.areaOfShape();
    }
}
