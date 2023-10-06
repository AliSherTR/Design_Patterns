package gof.decorator.shape;

public class SimpleShape extends ShapeDecorator{

    public SimpleShape(Shape DecoratedShape) {
        super(DecoratedShape);
    }

    @Override
    public void draw(){
        DecoratedShape.draw();
        setRedBorder(DecoratedShape);
    }

    private void setRedBorder(Shape DecoratedShape) {
        System.out.println("Border: Thick, Background Color: Red");
    }
}
