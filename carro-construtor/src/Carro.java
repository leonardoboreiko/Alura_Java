public class Carro {

	private int ano;
	private String modelo;
	private double preco;

	// Contrutor instanciado
	public Carro(int ano, String modelo, double preco) {
		if (ano >= 1891) {
			this.ano = ano;
		} else {
			System.out.println("O ano informado est� inv�lido. Por isso usaremos 2017!");
			this.ano = 2017;
		}

		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo n�o foi informado. Por isso usaremos Gol!");
			this.modelo = "Gol";
		}

		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O pre�o n�o � v�lido. Por isso usaremos 40000.0!");
			this.preco = 40000.0;
		}
	}

	// Novo construtor AQUI!
	public Carro(String modelo, double preco) {
		this.ano = 2017;
		if (modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo n�o foi informado. Por isso usaremos Gol!");
			this.modelo = "Gol";
		}

		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O pre�o n�o � v�lido. Por isso usaremos 40000.0!");
			this.preco = 40000.0;

		}
	}
	// Forma correta de declarar o novo construtor
//	public Carro(String modelo, double preco){
//        this(2017, modelo, preco);
//    }
	
	//Conclus�o
	//No Java � poss�vel fazer a chamada de um construtor dentro de outro e faz-se isso para evitar 
	//duplica��es de c�digos e regras. Afinal uma regra aplicada em um construtor normalmente 
	//ser� a mesma para o outro caso. Para isso usa-se o this( ) passando os par�metros 
	//correspondentes ao construtor que se queira chamar.	
	

	// Getters and Setters
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}

