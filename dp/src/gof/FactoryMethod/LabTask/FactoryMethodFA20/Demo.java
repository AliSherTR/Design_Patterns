
package GOF.CreationalPattern.FactoryMethod.LabTask;


import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		CricleGeometry cricleGeomerty = new CricleGeometry();
		SquareGeometry squareGeometry = new SquareGeometry();
                TriangleGeometry triangleGeometry = new TriangleGeometry();
		
		shapes.add(cricleGeomerty.createShape());
		shapes.add(squareGeometry.createShape());
                shapes.add(triangleGeometry.createShape());
		
		for(Shape s:shapes){
			s.draw();
		}

	}

}