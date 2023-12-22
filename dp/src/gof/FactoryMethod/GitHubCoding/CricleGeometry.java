
package GOF.CreationalPattern.FactoryMethod.GitHubCoding;


public class CricleGeometry extends Geometery{

	public Shape createShape() {
		return new Circle();
	}

}
