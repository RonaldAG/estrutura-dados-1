package com.ronald.teste;

import com.ronald.array.Vetor;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
			vetor.adiciona("elemento 4");
			vetor.adiciona("elemento 5");

			System.out.println(vetor.tamanho());
			System.out.println(vetor);
			
			vetor.adiciona(2, "ELEMENTO INTRUSO");
			System.out.println(vetor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
