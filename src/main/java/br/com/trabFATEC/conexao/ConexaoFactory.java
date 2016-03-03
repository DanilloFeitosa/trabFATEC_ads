package br.com.trabFATEC.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/trabFATEC","postgres","123");
		} catch (SQLException e) {
		    //relançando a exceção
			throw new RuntimeException(e);
		}
	}

}
