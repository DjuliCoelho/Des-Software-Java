package Principal;
import java.sql.*;

public class Programa {
	
public static void main(String[] args) {
		
		
		//Pessoa p = new Pessoa(1, "João Paulo", "1234567890", 1.67);
		
		//atualizarPessoa(p);		
		//salvarPessoa(p);		
		//excluirPessoa(3);
		
		listarPessoas();

	}
	
	public static void excluirPessoa(int id) {

		try {

			String url = "jdbc:mysql://localhost:3306/exjava";
			String usuario = "root";
			String senha = "positivo";
			
			String sql = "DELETE FROM pessoas WHERE `id` = ?;";
			

			// 1. Abrir a conexão com o banco'
			Connection con = DriverManager.getConnection(url, usuario, senha);

			// 2. Criar o comando e executar a consulta			
			PreparedStatement comando = con.prepareStatement(sql);			
			comando.setInt(1, id);
			
			comando.executeUpdate();			
			
			comando.close();
			con.close();
			System.out.println("Deu tudo certo!");

		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			//System.out.println(erro);
		}

	}
	
	public static void atualizarPessoa(Pessoa pessoa) {

		try {

			String url = "jdbc:mysql://localhost:3306/exjava";
			String usuario = "root";
			String senha = "positivo";
			
			String sql = "UPDATE pessoas SET `nome` = ?, `cpf` = ?, `altura` =  ? WHERE `id` = ?;";
			

			// 1. Abrir a conexão com o banco'
			Connection con = DriverManager.getConnection(url, usuario, senha);

			// 2. Criar o comando e executar a consulta			
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, pessoa.getNome());
			comando.setString(2, pessoa.getCpf());
			comando.setDouble(3, pessoa.getAltura());
			
			comando.setInt(4, pessoa.getId());
			
			comando.executeUpdate();			
			
			comando.close();
			con.close();
			System.out.println("Deu tudo certo!");

		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}

	}

	
	
	public static void salvarPessoa(Pessoa pessoa) {

		try {

			String url = "jdbc:mysql://localhost:3306/exjava";
			String usuario = "root";
			String senha = "positivo";
			
			String sql = "INSERT INTO pessoas (`nome`,`cpf`,`altura`) VALUES (?,?,?);";
			

			// 1. Abrir a conexão com o banco
			Connection con = DriverManager.getConnection(url, usuario, senha);

			// 2. Criar o comando e executar a consulta			
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, pessoa.getNome());
			comando.setString(2, pessoa.getCpf());
			comando.setDouble(3, pessoa.getAltura());
			
			comando.executeUpdate();			
			
			comando.close();
			con.close();
			System.out.println("Deu tudo certo!");

		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}

	}

	public static void listarPessoas() {

		try {

			String url = "jdbc:mysql://localhost:3306/exjava";
			String usuario = "root";
			String senha = "positivo";

			// 1. Abrir a conexão com o banco
			Connection con = DriverManager.getConnection(url, usuario, senha);

			// 2. Criar o comando e executar a consulta
			Statement comando = con.createStatement();
			ResultSet resultado = comando.executeQuery("select * from pessoas");

			// 3. Utilizar os dados
			while (resultado.next()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				String cpf = resultado.getString("cpf");
				double altura = resultado.getDouble("altura");

				System.out.println("----------------");
				System.out.println("ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("CPF: " + cpf);
				System.out.println("Altura: " + altura);
			}
			comando.close();
			con.close();

		} catch (Exception erro) {
			System.out.println("Algo deu errado!");
			System.out.println(erro);
		}

	}

}

