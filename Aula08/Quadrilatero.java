package Aula08;

public abstract class Quadrilatero {
	
	public abstract float calculaArea();
	
	public abstract float calculaPerimetro();
	
	public void imprimirArea() {
		System.out.println("A área é = " + this.calculaArea());
	}
	
	public void imprimirPerimetro() {
		System.out.println("O perímetro é de = " + this.calculaPerimetro());
	}
}
