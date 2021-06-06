package contas;

/**
 * POO - Exemplo 3 (abstracao, heran�a, polimorfismo e encapsulamento)
 * 
 * @author Professor Jose de Assis
 *
 */
public class Conta {
	//atributos
	private String cliente;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	private double saldo;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//construtor
	public Conta() {
		System.out.println("Ag�ncia 0261");
	}
	//metodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("D�bito: R$ " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Cr�dito: R$ " + valor);
	}
	
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transfer�ncia: R$ " + valor);
	}
	
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}