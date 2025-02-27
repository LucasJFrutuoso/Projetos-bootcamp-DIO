package projetoContaBancaria.tipoDeOperacao;

import projetoContaBancaria.caixaEletronico.ContaBancaria;

//CLASSE HERANÇA PARA REUTILIZAR CODIGOS DA CLASSE PAI 'contaPoupanca'
public class contaCorrente extends ContaBancaria {

	private double taxaManutencao;

	// CONSTRUTOR
	public contaCorrente(String titular, int numeroConta, double saldo, double taxaManutencao) {
		super(titular, numeroConta, saldo);
		this.taxaManutencao = taxaManutencao;
	}

	// MÉTODO PARA REALIZAR O CALCULO DA TAXA DE MANUTENÇÃO DO SAQUE
	public void descontarTaxa() {
		if (taxaManutencao > 0 && taxaManutencao <= exibirSaldo()) {
			sacar(taxaManutencao);
			System.out.println("Taxa de manutenção: " + taxaManutencao);
		} else {
			System.out.println("Valor insuficiente para a taxa de manutenção!");
		}
	}

}
