package projetoContaBancaria.agenciaBancaria;

import java.util.ArrayList;
import projetoContaBancaria.caixaEletronico.ContaBancaria;

public class Banco { 

	private String nome;
	private ArrayList<ContaBancaria> contas = new ArrayList<>();

	// Construtor
	public Banco(String nome) {
		this.nome = nome;
	}

	// Método para adicionar uma conta ao banco
	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
		System.out.println("Conta adicionada com sucesso : " + conta.getTitular());
	}

	// Método para buscar uma conta pelo número da conta
	public ContaBancaria buscarConta(int numeroConta) {
		for (ContaBancaria conta : contas) {
			if (conta.getNumeroConta() == numeroConta) {
				return conta;
			}
		}
		return null; // Retorna null se não encontrar a conta
	}

	// Método para listar todas as contas cadastradas
	public void listarContas() {
		System.out.println("=== Contas do Banco " + nome + " ===");
		for (ContaBancaria conta : contas) {
			System.out.println("Titular: " + conta.getTitular() + " | Conta: " + conta.getNumeroConta() + " | Saldo: R$"
					+ conta.exibirSaldo());
		}
	}

	// Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
