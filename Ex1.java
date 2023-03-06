import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		System.out.println("Insira seu nome: ");
		nome = leitor.nextLine();
		
		int mat;
		System.out.println("Informe sua matrícula: ");
		mat = leitor.nextInt();
		
		double n1,n2,nf;
		System.out.println("Nota 1: ");
		n1 = leitor.nextDouble();
		System.out.println("Nota 2: ");
		n2 = leitor.nextDouble();
		
		nf = (n1+n2)/2;
		
		System.out.println("Matrícula: "+mat+"\nNome: "+nome);
		
		String mensagem = "Aprovado: (%s)Sim (%s)Não";
		
		if(nf>=6) {
			System.out.printf(mensagem, "x", " ");
		}
		else {
			System.out.printf(mensagem, " ", "x");
		}
		System.out.println("\nNota final: "+nf);
		
		leitor.close();
	}
}