package Aula08;
// ave é abstrata também!!
public abstract class Ave extends Animal {
	double velocidadeVoo;
	abstract void voar(); 
	
	public Ave(String dataNascimento, double velocidadeVoo) {
		super(dataNascimento);
		this.velocidadeVoo = velocidadeVoo;
	}
}
