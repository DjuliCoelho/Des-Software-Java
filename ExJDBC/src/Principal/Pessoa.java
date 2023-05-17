package Principal;

public class Pessoa {

	private int id;
	private String nome;
	private String cpf;
	private double peso;

	
	public Pessoa(String nome, String cpf, double peso) {
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
	}
	
	public Pessoa(int id, String nome, String cpf, double peso) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(double peso) {
		this.peso = peso;
	}

}

