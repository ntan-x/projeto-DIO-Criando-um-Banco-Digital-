
public class ContaPrevidencia extends Conta {
	public ContaPrevidencia(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato da conta previdência");
		super.imprimirInfosComuns();
	}
	
}
