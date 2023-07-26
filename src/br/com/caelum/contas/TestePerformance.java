package br.com.caelum.contas;

import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {
	public static void main(String[] args) {
		System.out.println("iniciando..");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 10000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
