package OOP;

public class Rectangle extends Shape{
    private final PartsOfFigures partsOfFigures;

    public Rectangle(PartsOfFigures partsOfFigures){
        this.partsOfFigures = partsOfFigures;
    }

    @Override
    public void areaOfShape() {
        int area = partsOfFigures.sideA * partsOfFigures.sideB;
        System.out.println("Rectangle area is "+area);
    }
}
