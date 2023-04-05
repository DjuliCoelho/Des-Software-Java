package Principal;

import Principal.pessoa.*;

public class Programa {

public static void main(String[] args) {
		
		Pessoa pessoaEu = new Pessoa();
		pessoaEu.setNome("Djuli");  
		pessoaEu.setCPF(123654);
		pessoaEu.setPeso(12);
		
		Pessoa pessoaVc = new Pessoa();
		pessoaVc.setNome("Penélope");  
		pessoaVc.setCPF(4521369);
		pessoaVc.setPeso(12);
		
		
		
		System.out.println("Nome: " + pessoaEu.getNome());
		System.out.println("CPF: " + pessoaEu.getCPF());
		System.out.println("Peso: " + pessoaEu.getPeso());
		
		System.out.println("Nome: " + pessoaVc.getNome());
		System.out.println("CPF: " + pessoaVc.getCPF());
		System.out.println("Peso: " + pessoaVc.getPeso());
		
		
}
}

