package leo;

import java.sql.Connection;
import java.sql.DriverManager;

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
			
		}catch(Exception e) {
			
			
		}
		
	}

}

