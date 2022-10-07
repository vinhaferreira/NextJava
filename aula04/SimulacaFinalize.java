package Aula04;

import java.util.Scanner;

public class SimulacaFinalize {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno();
		a.nome = "Eduardo";
		System.out.println(a.nome);
		a= new Aluno();
		a.nome =null;
		int x = entrada.nextInt();
		System.out.println(a.nome);

	}

}
