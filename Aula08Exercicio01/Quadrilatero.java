package Aula08Exercicio01;
/*1 - Implemente, em Java, uma classe abstrata de nome Quadrilatero onde são declarados 
 * dois métodos abstratos: 
	float calcularArea();
	float calcularPerimetro();

	Crie, como subclasse de Quadrilatero, uma classe de nome Retangulo cujas instâncias são caracterizadas pelos atributos lado e altura
	ambos do tipo float.

	Implemente na classe Retangulo os métodos herdados de Quadrilatero e outros que ache necessários.
*/
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
