package projetoContaBancaria.caixaEletronico;

//ENCAPSULAMENTO PARA RESTRINGR OS ACESSOS AOS ATRIBUTOS

public class ContaBancaria {

	// ATRIBUTOS PRIVADOS
	private String titular;
	private int numeroConta;
	private double saldo;

	// CONSTRUTOR
	public ContaBancaria(String titular, int numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	// MÉTODO PARA DEPOSITAR E EXIBIR SALDO APÓS A OPERAÇÃO
	public void depositar(double valor) {
		if (valor > 0)
			saldo += valor;

	}

	// METODO PARA SACAR E XIBIR O SALDO APÓS A OPERAÇÃO
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo)
			saldo -= valor;
	}

	// METÓDO PARA EXIBIR O SALDO
	public double exibirSaldo() {
		return saldo;
	}

	// MÉTODOS GETTERS E SETTERS PARA ACESSAR OS ATRIBUTOS
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}
