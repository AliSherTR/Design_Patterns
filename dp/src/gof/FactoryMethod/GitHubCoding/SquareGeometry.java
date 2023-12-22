
package GOF.CreationalPattern.FactoryMethod.GitHubCoding;

public class SquareGeometry extends Geometery{

	public Shape createShape() {
		return new Square();
	}

}