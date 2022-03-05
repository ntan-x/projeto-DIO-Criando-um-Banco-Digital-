
public abstract class Conta implements InterfaceConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


	public void sacar(double valor) {
		saldo -= valor;
	}

	
	public void depositar(double valor) {
		saldo += valor;
	}

	
	public void transferir(double valor, InterfaceConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	public void transferir(InterfaceConta contaDestino) {
		double var;
		var = saldo;
		this.sacar(saldo*0.1);
		contaDestino.depositar(var*0.1);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


}
