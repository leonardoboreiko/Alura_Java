public class Gerente extends Funcionario {
	// Atributos
	private int senha;

	// Métodos
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	//Getters and Setters
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}