package gof.decorator.shape;
// Create abstract decorator class implementing the Shape interface.
public abstract class ShapeDecorator {
    protected Shape DecoratedShape;

    ShapeDecorator(Shape shape){
        this.DecoratedShape = shape ;
    }

    public void draw(){
        DecoratedShape.draw();
    }
}
