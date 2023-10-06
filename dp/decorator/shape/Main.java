package gof.decorator.shape;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        SimpleShape simpleCircle = new SimpleShape(new Circle());
        simpleCircle.draw();
        SimpleShape simpleRectangle = new SimpleShape(new Rectangle());
        simpleRectangle.draw();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        if(redCircle.instances > 0) {
            circle.draw();
        }
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();

        ThickDecorator thickDecorator = new ThickDecorator(new Circle());
        thickDecorator.draw();
    }
}
