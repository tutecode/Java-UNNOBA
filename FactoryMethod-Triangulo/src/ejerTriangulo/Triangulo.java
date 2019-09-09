package ejerTriangulo;

public abstract class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC; //con sus get y set
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);		
	}
	
	//Cada subclase debe redefinir estos tres métodos abastractos.
	public abstract String getDescription();
	public abstract double getSuperficie();
	public abstract void dibujate();

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	
	
	
	
	
}
