package Aula08;

public abstract class Animal {
	protected String dataNacimento;
	
	protected abstract void nascer(); 
	
	public Animal(String dataNascimento) {
		this.dataNacimento = (dataNascimento);
	}

}
