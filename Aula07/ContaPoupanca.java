package Aula07;

public class ContaPoupanca extends Conta {
	double taxaJuros;
	void render() {
		saldo = saldo * (1 + taxaJuros/100);
	}
}
