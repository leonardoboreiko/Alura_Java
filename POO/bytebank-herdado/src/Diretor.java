
public class Diretor extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chama o m�todo do Diretor");
		return super.getBonificacao() + 500;
	}


}
