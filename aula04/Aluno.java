package aula04;

public class Aluno {
	long matricula;
	String nome;
	public void finalize(){
		System.out.println("Eu," + this.nome + "MORRI");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	
	

}
