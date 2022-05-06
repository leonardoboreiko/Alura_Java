
public class Diretor extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chama o método do Diretor");
		return super.getBonificacao() + 500;
	}


}
