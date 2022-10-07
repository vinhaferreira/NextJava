package Aula06Animais;

import Aula06Mamifero.Homem;

public class ProgramaHierarquia {
	public static void main(String[] args) {
		Homem h1 = new Homem("11/11/1971");
		h1.mamar();
		h1.nascer();
		h1.pensar();
		System.out.println(h1.dataNacimento);
		//public - visivel no universo
		//protected-visivel no pacote e na sub-hierarquia(ou em subclasse)
		//deafault - visivel no pacote
		//private visivel na classe
	
	}
}
