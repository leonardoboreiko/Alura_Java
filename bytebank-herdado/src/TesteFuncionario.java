
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Leonardo Boreiko");
		funcionario.setCpf("037.313.879-21");
		funcionario.setSalario(3000.0);
		

		System.out.println(" Ol�, " + funcionario.getNome() + " seu sal�rio somado com a bonifica��o ser� de R$ "
				+ funcionario.getBonificacao());

	}

}
