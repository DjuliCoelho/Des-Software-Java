import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 int a;
		 int b;
		 
		 System.out.println("Digite o valor de A");
		 a = leitor.nextInt();
		 
		 System.out.println("Digite o valor de B");
		 b = leitor.nextInt();
		 
		 if (a == b) {
			 System.out.println("A sequencia de num informada é invalida");
		 }else {
			 if(a > b) {
				 System.out.println("A é maior que B");
			 }else {
				 System.out.println("B maior que A");
			 }
		 }


	leitor.close();	 
	}

}
