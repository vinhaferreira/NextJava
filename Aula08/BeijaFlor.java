package Aula08;

public class BeijaFlor extends Ave{
	@Override
	protected void nascer() {
		System.out.println("Nascendo como um beija flor");
	}
	@Override
	void voar() {
		System.out.println("Voando como um beija flor");
	}
	
	double tempoDeParadinha;
	public BeijaFlor(String dataNascimento, double velocidadeVoo, double tempoDeParadinha) {
		super(dataNascimento, velocidadeVoo);
		this.tempoDeParadinha = tempoDeParadinha;
	}

}
