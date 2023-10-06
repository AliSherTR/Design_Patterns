package gof.decorator.shape;
// concrete class implementing the shape interface
public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Shape: Rectangle");
    }

}
