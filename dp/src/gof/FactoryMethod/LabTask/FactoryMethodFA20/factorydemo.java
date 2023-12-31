
package GOF.CreationalPattern.FactoryMethod.LabTask;




import java.util.ArrayList;

public class factorydemo {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle = ShapeFactory.createShape("Circle");
        Shape square = ShapeFactory.createShape("Square");
        Shape triangle = ShapeFactory.createShape("Triangle");

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class ShapeFactory {

    public static Shape createShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
}


