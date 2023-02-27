package com.ronald.array;

public class Vetor {
	private Object[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public void adiciona(Object elemento) throws Exception{
		verificaCapacidade();
		
		if(elementos.length == tamanho) {
			throw new Exception("O vetor já está cheio, não é possivel adicionar mais elementos");
		}
		
		elementos[tamanho] = elemento;
		tamanho++;
		
	}
	
	public void adiciona(int posicao, Object elemento) throws Exception{
		verificaCapacidade();
		
		if(posicao > elementos.length || posicao < 0) {
			throw new Exception("Posição inválida");
		}
		
		if(elementos.length == tamanho) {
			throw new Exception("O vetor já está cheio, não é possivel adicionar mais elementos");
		}
		
		for(int i = tamanho - 1; i > posicao; i--) {
			elementos[i] = elementos[i - 1];
		}
		
		elementos[posicao] = elemento;
		tamanho++;
	}
	
	public void remove(int posicao) throws Exception{
		if(posicao >= elementos.length || posicao < 0) {
			throw new Exception("Posição inválida");
		}
		
		if(elementos[posicao] == null) {
			throw new Exception("Posição é nula");
		}
		
		for(int i = posicao; i < tamanho - 1; i++) {
			elementos[i] = elementos[i + 1];
		}
		
		elementos[tamanho - 1] = null;
		this.tamanho--;
		
	}

	public int tamanho() {
		return this.tamanho;
	}
	
	public Object busca(int posicao) throws Exception{
		if(posicao >= 0 && posicao < tamanho) {
			return elementos[posicao];			
		}
		
		throw new Exception("Posição inválida.");
	}
	
	public int busca(Object elemento) {
		for(int i = 0; i < elementos.length; i++) {
			if(elementos[i] == elemento) {
				return i;
			}
		}
		return -1;
	}
	
	public void substituir(Object elemento) {
		int index = busca(elemento);
		if(index != -1) {
			elementos[index] = elemento;
		}
	}
	
	private void verificaCapacidade() {
		if(tamanho == elementos.length) {
			Object[] novosElementos = new Object[elementos.length * 2];
			
			for(int i = 0; i < elementos.length; i++) {
				novosElementos[i] = elementos[i];
			}
			elementos = novosElementos;
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		for(int i =0; i < this.tamanho - 1; i++) {
			s.append(elementos[i]);
			s.append("\n");
		}
		
		if(tamanho > 0) {
			s.append(elementos[tamanho - 1]);
		}
		
		return s.toString();
	}
	
}

