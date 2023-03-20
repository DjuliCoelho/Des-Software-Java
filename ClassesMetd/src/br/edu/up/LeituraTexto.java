package br.edu.up;
	
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class LeituraTexto {
		
		public static void main(String[] args) throws FileNotFoundException {
			
			File arquivo = new File("C:\\_src\\Java2D\\ClassesMetd\\d.txt");
			Scanner leitor = new Scanner(arquivo);
			
			while(leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				String[] vetor = linha.split(" ");
				
				System.out.println("Nome completo: " + linha);
				System.out.println("Primeiro nome: " + vetor[0]);
				for(int i = 0; i < linha.length(); i++) {
					char caractere = linha.charAt(i);
					System.out.println("Caractere: " + caractere);
				}			
				
				System.out.println("Tamanho:" + linha.length());
			}

			leitor.close();
			
		}

	}



