package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Batman");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(10000);
		banco.adiciona(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Coringa");
		c2.setNumero(2);
		c2.setAgencia("2000");
		c2.deposita(20000);
		banco.adiciona(c2);
	
		banco.mostraContas();
	}
}
