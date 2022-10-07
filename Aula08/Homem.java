package Aula08;

public class Homem extends Mamifero implements Pensavel {
	public void pensar() {
		System.out.println("Pensando");
	}
	public Homem(String dataNascimento) {
		super(dataNascimento);
	}
	
}
