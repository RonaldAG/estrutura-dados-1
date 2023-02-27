package com.ronald.teste;

import java.util.Scanner;

import com.ronald.array.Produto;
import com.ronald.array.SacolaDeCompras;

public class Teste2 {
	public static void main(String[] args) {
		SacolaDeCompras sacolaDeCompras = new SacolaDeCompras(5);
		
		String resp = "";
		long index = 1;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			do {
				System.out.println("\n==========================");
				System.out.println("Produto " + index);
				System.out.print("Código do produto: ");
				int codigo = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();
				
				System.out.print("Quantidade do produto: ");
				int quantidade = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("Descrição do produto: ");
				String descricao = sc.nextLine();
				
				sacolaDeCompras.adicionaProduto(new Produto(codigo, nome, quantidade, descricao));
				
				
				System.out.print("Deseja adicionar mais produtos?(y/n) ");
				resp = sc.next();
				index++;
			} while(resp.equals("y"));
			
			System.out.println("\n==========================");
			System.out.println("Deseja excluir algum produto?(y/n) ");
			resp = sc.next();
			
			while(resp.equals("y")) {
				System.out.println("Informe o código do produto: ");
				int codigo = sc.nextInt();
				
				sacolaDeCompras.removeProduto(codigo);
				
				System.out.println("Deseja excluir algum produto?(y/n) ");
				resp = sc.next();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n==========================");
		System.out.println("Quantidade total: " + sacolaDeCompras.tamanho());
		System.out.println(sacolaDeCompras);
	}
}
