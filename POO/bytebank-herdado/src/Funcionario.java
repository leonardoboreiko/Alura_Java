public class Funcionario {
	// Atributos
	private String nome;
	private String cpf;
	protected double salario;

	// M�todos
	public double getBonificacao() {
		return this.salario + salario * 0.1;
	}

	// Getters and Setters
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}