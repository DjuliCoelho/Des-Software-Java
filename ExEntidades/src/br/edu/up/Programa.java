package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.edu.up.entidades.Produto;
public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		String arquivoOrigem = "C:\\_src\\Java2D\\ExEntidades\\produto.csv";
		File arquivo = new File(arquivoOrigem);
		Scanner leitor = new Scanner(arquivo);
	
		int index = 0;
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String[] valores = linha.split(";");
			
			Produto produto = new Produto();
			produto.codigo = Integer.parseInt(valores[0]);
			produto.nome = valores[1];
			produto.marca = valores[2];
			produto.preco = Double.parseDouble(valores[3]);
			
			vetorDeProdutos[index] = produto;
			index++;
		}
		
		int qtdeDeProdutos = 0;
		double totalDosProdutos = 0;
		
		for (int int i = 0; i < vetorDeProdutos.length; i++) {
			Produto produto = vetorDeProdutos[i];
			System.out.println("Código: " + produto.codigo);
			System.out.println("Nome: " + produto.nome);
			System.out.println("Marca: " + produto.marca);
			System.out.println("Preço: " + produto.preco);
			System.out.println();
			
			qtdeDeProdutos++;
			totalDosProdutos+= produto.preco;
		}
		
		
		
		/*Produto meuProduto = new Produto();
		meuProduto.codigo = 1;
		meuProduto.nome = "Computador";
		meuProduto.marca = "Dell";
		meuProduto.preco = 3000.00;
		
		Produto seuProduto = new Produto();
		seuProduto.codigo = 2;
		seuProduto.nome = "Iphone";
		seuProduto.marca = "Apple";
		seuProduto.preco = 5000.000;
		
		System.out.println("Meu produto");
		System.out.println("Código: " + meuProduto.codigo);
		System.out.println("Nome: " + meuProduto.nome);
		System.out.println("Marca: " + meuProduto.marca);
		System.out.println("Preço: " + meuProduto.preco);
		System.out.println();
		
		System.out.println("Meu produto");
		System.out.println("Código: " + seuProduto.codigo);
		System.out.println("Nome: " + seuProduto.nome);
		System.out.println("Marca: " + seuProduto.marca);
		System.out.println("Preço: " + seuProduto.preco);
		System.out.println();
		*/
		
		
	}

}
