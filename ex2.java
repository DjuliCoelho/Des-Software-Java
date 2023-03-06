import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número");
		numero = leitor.nextInt();
		
		if(numero >10) {
			System.out.println("Número é maior quue 10");
			
		}else {
			System.out.println("Número menor ou igual a 10");
		}
		
		leitor.close();
		
		
	}

}
//ex lista do professor