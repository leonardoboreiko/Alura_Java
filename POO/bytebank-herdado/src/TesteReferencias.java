
public class TesteReferencias {

	public static void main(String[] args) {
		
		// Construtor 
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gabriela");
		gerente.setSalario(1000.0);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Max");
		funcionario.setSalario(1000.0);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Fernanda");
		diretor.setSalario(1000.0);
		
				
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		System.out.println(gerente.getNome());
		controle.registra(funcionario);
		System.out.println(funcionario.getNome());
		controle.registra(diretor);
		System.out.println(diretor.getNome());
		
		System.out.println(controle.getSoma());
	}

}
