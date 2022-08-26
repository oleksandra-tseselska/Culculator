package OOP;

public class Triangle extends Shape{
    private final PartsOfFigures partsOfFigures;

    public Triangle(PartsOfFigures partsOfFigures) {
        this.partsOfFigures = partsOfFigures;
    }

    @Override
    public void areaOfShape(){
        double area = (partsOfFigures.sideA * partsOfFigures.sideB * partsOfFigures.sideC)/(4 * partsOfFigures.radius);
        System.out.println("Triangle area is "+String.format("%.0f", area));
    }
}
