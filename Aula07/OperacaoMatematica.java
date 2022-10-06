package Aula07;

public class OperacaoMatematica {
	
	//overload 
	public int somar(int s1, int s2) {
		return s1 + s2;
	}	
	public double somar(int s1, double s2) {
		return somar (s1,s2, 0.0);
	}
	public double somar(double s1, double s2, double s3) {
		return s1 + s2 + s3;
	
	}
	public double somar(double[] valores){
		double soma = 0;
		for (int i=0; i<valores.length; i++) { 
			soma = soma + valores[i];
		}
		return soma;
	}
}
