package Aula08;

import Aula06Animais.Animal;

public class Mamifero extends Animal {
	public void mamar() {
		System.out.println("Mamando");
	}
	public Mamifero(String dataNascimento) {
		super(dataNascimento);
	}
}
