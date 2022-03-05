
public class ExecutarProcesso {

	public static void main(String[] args) {
		Cliente natan = new Cliente();
		natan.setNome("Natan");
		
		Conta corrente = new ContaCorrente(natan);
		Conta poupanca = new ContaPoupanca(natan);
		Conta previdencia = new ContaPrevidencia(natan);
		
		corrente.depositar(500);
		corrente.imprimirExtrato();
		
		
		corrente.transferir(previdencia);
		previdencia.imprimirExtrato();
		poupanca.imprimirExtrato();
		corrente.imprimirExtrato();
	}
	

}
