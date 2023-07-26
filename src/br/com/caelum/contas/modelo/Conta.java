package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
	
	protected double saldo;
	String titular;
	int numero;
	String agencia;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar"
					+ " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Você tentou sacar"
					+ " um valor negativo");
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public abstract String getTipo();
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);		
	}
	
	@Override
	public String toString() {
		return "[titular=" + titular.toUpperCase() + ", numero" + numero + ", agencia" + agencia + "]" ;
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	//getters and setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

}
