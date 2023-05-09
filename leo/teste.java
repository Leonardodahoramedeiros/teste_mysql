package leo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class teste {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/exemplo";
		String usuario = "root";
		String senha = "positivo";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//estabelecer a conexao
			Connection conn = DriverManager.getConnection(url,usuario, senha);
			System.out.println(conn.isValid(0));
			
			
			/* exemplo para select
			//monstar a instrução para montar o banco de dados 	
			String sql = "select * from clientes where nome = ?";
			
			//prepara o comando (preparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//atribuir os valoes aos parametros da instrução do SQL
			ps.setString(1, "Pedro de Lara");
			
			//executa o sql e recebe o obejto do tipo Resultset
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				System.out.println(id + " " + nome + " " + email +" ");
			}
			*/
			//=================================
			/*exemplo para insert*/
			
			/*
			String sql = "insert into clientes(id, cpf, nome, email) values(?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, 3);
			ps.setString(2, "101010");
			ps.setString(3, "Sergio Malandro");
			ps.setString(4, "malandro@mail.com");
			
			int retorno = ps.executeUpdate();
			System.out.println(retorno);
			*/
			
			
			//Exemplo do update
			/*String sql = "update clientes set email = ? where cpf = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "pedrao@mail.com");
			ps.setString(2, "888");
			int retorno = ps.executeUpdate();
			if(retorno > 0) {
				System.out.println("dado atualizado");
			}
			*/
			
			String sql = "delete from clientes where cpf = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "888");
			ps.executeUpdate();
	
			
		}catch(Exception e) {
			System.out.println(e);
			
			
		}
		
	}

}

