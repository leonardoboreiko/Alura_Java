
public class Contas {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Clientes titular;
	
	// Construtor
	public Contas(int agencia,int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Cria nova conta " + this.numero);
	}
	
	// Métodos
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Contas destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	// Getters and Setters
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode lançar valores menores que 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int Numero) {
		if (numero <= 0) {
			System.out.println("Não aceita agencia valor <=0");
			return;
		}
		this.numero = Numero;
	}

	public Clientes getTitular() {
		return titular;
	}

	public void setTitular(Clientes titular) {
		this.titular = titular;
	}

}
