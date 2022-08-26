package OOP;

public class Circle extends Shape {

    private final PartsOfFigures partsOfFigures;

    public Circle(PartsOfFigures partsOfFigures){
        this.partsOfFigures = partsOfFigures;
    }

    @Override
    public void areaOfShape(){
        double area = Math.PI * Math.pow(partsOfFigures.radius, 2);
        System.out.println("Circle area is  "+String.format("%.0f", area));
    }
}
