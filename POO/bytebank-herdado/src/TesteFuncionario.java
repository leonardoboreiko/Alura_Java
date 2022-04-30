
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Leonardo Boreiko");
		funcionario.setCpf("037.313.879-21");
		funcionario.setSalario(3000.0);
		

		System.out.println(" Olá, " + funcionario.getNome() + " seu salário somado com a bonificação será de R$ "
				+ funcionario.getBonificacao());

	}

}
