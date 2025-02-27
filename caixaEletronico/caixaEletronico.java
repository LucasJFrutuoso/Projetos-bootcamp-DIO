package projetoContaBancaria.caixaEletronico;

import projetoContaBancaria.agenciaBancaria.Banco;
import projetoContaBancaria.tipoDeOperacao.contaCorrente;
import projetoContaBancaria.tipoDeOperacao.contaPoupanca;

//PROJETO utilizando encapsulamento, herança e polimorfismo.

public class caixaEletronico {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco da galera");

		contaPoupanca contaPoupanca = new contaPoupanca("João", 1243, 200, 2);
		contaCorrente contaCorrente = new contaCorrente("Maria", 8254, 1000, 25);

		banco.adicionarConta(contaCorrente);
		banco.adicionarConta(contaPoupanca);

		System.out.println("----------------------");

		contaCorrente.depositar(500);
		contaCorrente.descontarTaxa();

		System.out.println("----------------------");

		contaPoupanca.depositar(1000);
		contaPoupanca.exibirSaldo();

		System.out.println("----------------------");

	

	}

}
