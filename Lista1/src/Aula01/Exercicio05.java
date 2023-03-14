package Aula01;

import java.util.Scanner;
public class Exercicio05 {
		
	public static void main(String[] args){
	/**Ex 5. Leia valores nas variáveis ​​A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B eo
	valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.
	*/
		
		Scanner leitor = new Scanner ( System . in );
	int a ;
	int b ;
	int temp;

	System.out.println("Diga o primeiro numero: ");
	a = leitor.nextInt();
	System.out.println( "Diga o segundo numero: " );
	b = leitor.nextInt();
	System.out.println( "Valores originais: A = " + a + " B = " + b );
	temp = a ;
	a = b ;
	b = temp;
	System.out.println( "Valores trocados: A = " + a + " B = " + b );
	leitor.close();

	}
	}


