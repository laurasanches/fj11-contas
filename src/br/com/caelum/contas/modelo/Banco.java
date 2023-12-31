package br.com.caelum.contas.modelo;

import java.util.Iterator;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public void adiciona(Conta c) {
		for(int i = 0; i < this.contas.length; i++) {
			Conta conta = contas[i];
		}
	}
	
	public void mostraContas() {
		for (int i = 0; i < contas.length; i++) {
			Conta conta = contas[i];
			if (conta != null) {
				System.out.println("Conta na posi��o " + i);
				System.out.println("Saldo na conta: " + conta.getSaldo());
			}
			
		}

	}
}