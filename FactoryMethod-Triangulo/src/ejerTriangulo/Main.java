package ejerTriangulo;

public class Main {
	public static void main(String[] args) {
		TrianguloFactoryMethod factory = new TrianguloFactory();
		Triangulo triangulo = factory.createTriangulo(10, 10, 10);
		System.out.println(triangulo.getDescription());
	}
}
