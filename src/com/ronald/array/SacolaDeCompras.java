package com.ronald.array;

public class SacolaDeCompras {
	
	private Vetor produtos;

	public SacolaDeCompras(int capacidade) {
		this.produtos = new Vetor(capacidade);
	}
	
	public SacolaDeCompras(Vetor produtos) {
		super();
		this.produtos = produtos;
	}
	
	public void adicionaProduto(Produto produto) throws Exception {
		boolean produtoExiste = false;
		
		for(int i = 0; i < produtos.tamanho(); i++) {
			if(produtos.busca(i).equals(produto)) {
				
				Produto item = (Produto) produtos.busca(i);
				item.setQuantidade(item.getQuantidade() + produto.getQuantidade());
				
				produtos.substituir(item);
				
				produtoExiste = true;
			}
		}
		
		if(!produtoExiste) {
			produtos.adiciona(produto);
		}
	}
	
	public int tamanho() {
		return this.produtos.tamanho();
	}
	
	
	public void removeProduto(int posicao) throws Exception {
		produtos.remove(posicao);
	}

	public Vetor getProdutos() {
		return produtos;
	}

	public void setProdutos(Vetor produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "SacolaDeCompras \nProdutos:\n" + produtos + "]";
	}
	
	
	
}
