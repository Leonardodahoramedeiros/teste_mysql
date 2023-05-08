package leo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			
			
			
		}catch(Exception e) {
			System.out.println(e);
			
			
		}
		
	}

}

