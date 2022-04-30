public class FuncionarioTeste {
	
	public static void main(String[]args) {
		
		Funcionario funcionario =  new Funcionario();
		funcionario.setNome("Leonardo Boreiko");
		funcionario.setCpf("037.313.879-21");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}
	
}