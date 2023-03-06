import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a;
		int b;
		int soma;
		int div;
		int multi;
		int sub;
		
		System.out.println("Digite o valor de A");
		a = leitor.nextInt();
		
		System.out.println("Digite o valor de B");
		b = leitor.nextInt();
		
		soma = a + b;
		div = a / b;
		multi = a * b;
		sub = a - b;
		
		System.out.println("A soma é:" + soma);
		System.out.println("A divisão é:" + div);
		System.out.println("A multiplicação é:" + multi);
		System.out.println("A subtração é:" + sub);
		
		
		
		
		

	}
	

}