package classes;
import classes.individuo;

public class pessoa {
	public String nome;
	public String idade;
	public individuo pai;
	public individuo mae;
	
	public pessoa(String nome, String idade, individuo pai, individuo mae) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public individuo getPai() {
		return pai;
	}

	public void setPai(individuo pai) {
		this.pai = pai;
	}

	public individuo getMae() {
		return mae;
	}

	public void setMae(individuo mae) {
		this.mae = mae;
	}
}
