package Grupos;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class ProgTabulacao {
	public static void main(String[] args) throws IOException {
		
		String aqvGrupos = "C:\\Users\\djuli\\OneDrive\\Documentos\\gravaArq\\ExFicacao\\tabulacao";
		String relat = "C:\\Users\\djuli\\OneDrive\\Documentos\\gravaArq\\ExFicacao\\relatorios-grupo";
		//String aqvDestino = "C:\\Users\\djuli\\OneDrive\\Documentos\\gravaArq\\ExFicacao\\arqDestino";
		File arquivo = new File(aqvGrupos);
		//ler_arqv lê o arquivo dentro do parenteses, nesse coso o "arquivo" que ta armazenando a File aqvGrupos(localização do arquivo)
		Scanner ler_arqv = new Scanner(arquivo);
		Formatter gravador = new Formatter(relat);
		
		ler_arqv.nextLine();
		
		String[] vetGrupo = new String[72];
		int[] vetValor = new int[72];
		int i=0, valorTotal=0,TA=0,TB=0,TC=0,TD=0,TE=0,TF=0;
		while(ler_arqv.hasNextLine()) {
			// linha armazena dados da próxima linha do arquivo lido
			
			//A   10
			String linha = ler_arqv.nextLine();
			String [] vetLinha = linha.split("	");
			
			vetGrupo[i] = vetLinha[0];
			vetValor[i] = Integer.parseInt(vetLinha[1]);
			valorTotal+=vetValor[i];
			
			if(vetGrupo[i].equals("A")) {
				TA+=vetValor[i];
			}
			else if(vetGrupo[i].equals("B")) {
				TB+=vetValor[i];
			}
			else if(vetGrupo[i].equals("C")) {
				TC+=vetValor[i];
			}
			else if(vetGrupo[i].equals("D")) {
				TD+=vetValor[i];
			}
			else if(vetGrupo[i].equals("E")) {
				TE+=vetValor[i];
			}
			else {
				TF+=vetValor[i];
			}
			
			i++;
		}
			gravador.format("\nValores totais de A: "+TA);
			gravador.format("\nValores totais de B: "+TB);
			gravador.format("\nValores totais de C: "+TC);
			gravador.format("\nValores totais de D: "+TD);
			gravador.format("\nValores totais de E: "+TE);
			gravador.format("\nValores totais de F: "+TF);
			gravador.format("\nSoma total: "+valorTotal);
			
		/*	System.out.println("Valores totais de A: "+TA);
			System.out.println("Valores totais de B: "+TB);
			System.out.println("Valores totais de C: "+TC);
			System.out.println("Valores totais de D: "+TD);
			System.out.println("Valores totais de E: "+TE);
			System.out.println("Valores totais de F: "+TF);
			System.out.println("Soma total: "+valorTotal);*/
			
			
			
			
			ler_arqv.close();
			gravador.close();
			}
	}

			

		


	


