package Aula06;

public class Vendedor extends Funcionario {
	
	private double vendas;
	
	public Vendedor(String nome, String rg, double salario) {
		super(nome,rg,salario);
		this.vendas = 0;
	}
	public void
	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
}
