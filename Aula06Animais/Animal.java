package Aula06Animais;

public class Animal {
	protected String dataNacimento;
	protected void nascer() {
		System.out.println("Nascendo genericamente");
	}
	
	public Animal(String dataNascimento) {
		this.dataNacimento = (dataNascimento);
	}

}
