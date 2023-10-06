package gof.decorator.shape;
// concrete class implementing the shape interface
public class Circle implements Shape {

    @Override
    public void draw(){
        System.out.println("Shape: Circle");
    }


}
