
package GOF.CreationalPattern.FactoryMethod.LabTask;


public class SquareGeometry extends Geometery{

	public Shape createShape() {
		return new Square();
	}

}