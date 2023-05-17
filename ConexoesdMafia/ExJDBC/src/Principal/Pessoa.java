package Principal;

public class Pessoa {

	private int id;
	private String nome;
	private String cpf;
	private double altura;

	
	public Pessoa(String nome, String cpf, double altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.altura = altura;
	}
	
	public Pessoa(int id, String nome, String cpf, double altura) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.altura = altura;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}

