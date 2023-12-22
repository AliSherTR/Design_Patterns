
package GOF.CreationalPattern.FactoryMethod.LabTask;


public class CricleGeometry extends Geometery{

	public Shape createShape() {
		return new Circle();
	}

}
