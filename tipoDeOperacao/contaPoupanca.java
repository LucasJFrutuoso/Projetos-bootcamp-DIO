package projetoContaBancaria.tipoDeOperacao;

import projetoContaBancaria.caixaEletronico.ContaBancaria;

//CLASSE HERANÇA PARA REUTILIZAR CODIGOS DA CLASSE PAI 'contaPoupanca'
public class contaPoupanca extends ContaBancaria {

	private double taxaDeJuros;

	//CONSTRUTOR
	public contaPoupanca(String titular, int numeroConta, double saldo, double taxaDeJuros) {
		super(titular, numeroConta, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	//METODO PARA CALCULAR O JUROS DA POUPANÇA
	public void taxaPoupanca() {
		double rendimento = exibirSaldo() * (taxaDeJuros / 100);
		depositar(rendimento);
		System.out.println("Juros de R$" + rendimento);
	}

}
