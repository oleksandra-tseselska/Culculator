package OOP;

public class Square extends Shape {

    private final PartsOfFigures partsOfFigures;

    public Square(PartsOfFigures partsOfFigures) {

        this.partsOfFigures = partsOfFigures;
    }

    @Override
    public void areaOfShape(){
        double area = Math.pow(partsOfFigures.sideA, 2);
        System.out.println("Square area is "+String.format("%.0f", area));
    }
}
