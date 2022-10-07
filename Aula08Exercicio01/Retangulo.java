package Aula08Exercicio01;

public class Retangulo extends Quadrilatero{
	private float altura;
	private float lado;
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	@Override
	public float calculaArea() {
		float area = this.lado*this.altura;
		return area;
	}
	@Override
	public float calculaPerimetro() {
		float perimetro = (2*this.lado)+(2*this.altura);
		return perimetro;
	}
}




