
public class TesteGerente {

	public static void main(String[] args) {
		// Construtor Default
		Gerente gerente = new Gerente();
		gerente.setNome("Fernanda Marques");
		gerente.setCpf("077.158.329-01");
		gerente.setSalario(5000.00);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		//Valida senha
		gerente.setSenha(12345);
		boolean autenticou = gerente.autentica(12345);

		System.out.println("Deu certo? = " + autenticou);
		
		System.out.println(gerente.getBonificacao());

	}

}
