package com.ronald.teste;

import com.ronald.array.Vetor;

public class TesteBusca {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			
			// System.out.println(vetor.busca(3)); posição inválida
			
			System.out.println(vetor.busca("elemento 3")); // retorna -1 
			System.out.println(vetor.busca(1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		


	}
}
