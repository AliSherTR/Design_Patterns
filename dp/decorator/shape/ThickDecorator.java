package gof.decorator.shape;

public class ThickDecorator extends ShapeDecorator{

    public ThickDecorator(Shape DecoratedShape ){
        super(DecoratedShape);
    }

    @Override
    public void draw() {
        DecoratedShape.draw();
        setRedBorder(DecoratedShape);
    }

    private void setRedBorder(Shape DecoratedShape){
        System.out.println("Border: Thick");
    }
}
