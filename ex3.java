import java.util.Scanner;
public class At2 {

		
		public static void main(String[] args) {
			
		Scanner leitor = new Scanner(System.in);
		
		
		int num1;
		int num2;
		System.out.println("Digite o primeiro número");
		num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = leitor.nextInt();
		
		int total = num1 + num2;
		System.out.println("O total da soma é:" + total);
		
		leitor.close();
		
		
		}
			

}
