package gof.decorator.shape;
public class RedShapeDecorator extends ShapeDecorator {
    public int instances;
    public RedShapeDecorator(Shape DecoratedShape){
        super(DecoratedShape);
        instances++;
    }
    @Override
    public void draw() {
        DecoratedShape.draw();
        setRedBorder(DecoratedShape);
    }

    private void setRedBorder(Shape DecoratedShape){
        System.out.println("Border Color: Red");
    }
}
