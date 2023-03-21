package Aula03;
import java.util.Scanner;

public class Exercicio03 {
	
		    public static void main(String[] args) {
		        Scanner leitor = new Scanner(System.in);

		        // leitura dos dados do vendedor
		        System.out.print("Digite o nome do vendedor: ");
		        String nome = leitor.nextLine();

		        System.out.print("Digite o salário fixo do vendedor: ");
		        double salarioFixo = leitor.nextDouble();

		        System.out.print("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");
		        double vendas = leitor.nextDouble();

		        // cálculo do salário final
		        double comissao = vendas * 0.15;
		        double salarioFinal = salarioFixo + comissao;

		        // exibição do resultado
		        System.out.printf("Nome do vendedor: %s\n", nome);
		        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
		        System.out.printf("Salário no final do mês: R$ %.2f\n", salarioFinal);

		        leitor.close();
		    }
		

	}


