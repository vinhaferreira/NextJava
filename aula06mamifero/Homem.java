package Aula06Mamifero;

public class Homem extends Mamifero {
	public void pensar() {
		System.out.println("Pensando");
	}
	public Homem(String dataNascimento) {
		super(dataNascimento);
	}
}
