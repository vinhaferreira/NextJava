package Aula04;


public class MainFinalize {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Eduardo";
		System.out.println(a.nome);
		a= new Aluno();
		a.nome ="Carla";
		System.out.println(a.nome);

	}

}
