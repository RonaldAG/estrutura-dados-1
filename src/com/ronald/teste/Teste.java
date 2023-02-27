package com.ronald.teste;

import com.ronald.array.Vetor;

public class Teste {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
	}
}
