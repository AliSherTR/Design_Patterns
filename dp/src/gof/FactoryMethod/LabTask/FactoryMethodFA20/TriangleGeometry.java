
package GOF.CreationalPattern.FactoryMethod.LabTask;


public class TriangleGeometry extends Geometery {
    
	public Shape createShape() {
		return new Triangle();
	}
    
}
