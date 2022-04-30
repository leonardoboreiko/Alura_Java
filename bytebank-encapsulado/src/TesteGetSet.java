
public class TesteGetSet {
	
	public static void main(String[]args) {
		Conta conta = new Conta(4012,20657-1);
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leonardo Boreiko");
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Analista Desenvolvedor Java");
		System.out.println(conta.getTitular().getProfissao());
		
	}
	

}
