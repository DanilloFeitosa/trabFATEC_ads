package br.com.trabFATEC.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.trabFATEC.conexao.ConexaoFactory;
import br.com.trabFATEC.entidade.Usuario;

public class UsuarioDAO {
	
	private Connection con = ConexaoFactory.getConnection();
	
	
	
	public void cadastrar(Usuario usu) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO usuario (nome,login,senha) VALUES (?,?,?)";
		
	try {
		// Criando um Statement
		PreparedStatement preparador = con.prepareStatement(sql);
		//substitui o ? pelo dado passado pelo usuario
		preparador.setString(1, usu.getNome()); 
		preparador.setString(2, usu.getLogin());
		preparador.setString(3, usu.getSenha());
		//Executa o comando sql no banco
		preparador.execute();
		
		//fechar conexão (encerrando objeto preparador)
		preparador.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
//_________________________________________________________________
	public void alterar(Usuario usu) {
		// TODO Auto-generated method stub
		
		
		String sql = "UPDATE usuario SET nome=?,login=?,senha=? where id_usuario=?";
		
	try {
		// Criando um Statement
		PreparedStatement preparador = con.prepareStatement(sql);
		//substitui o ? pelo dado passado pelo usuario
		preparador.setString(1, usu.getNome()); 
		preparador.setString(2, usu.getLogin());
		preparador.setString(3, usu.getSenha());
		preparador.setInt(4, usu.getId_usuario());
		
		//Executa o comando sql no banco
		preparador.execute();
		
		//fechar conexão (encerrando objeto preparador)
		preparador.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	//_________________________________________________________________
		public void excluir(Usuario usu) {
			// TODO Auto-generated method stub
			
			
			String sql = "DELETE FROM usuario where id_usuario=?";
			
		try {
			// Criando um Statement
			PreparedStatement preparador = con.prepareStatement(sql);
			//substitui o ? pelo dado passado pelo usuario
			preparador.setInt(1, usu.getId_usuario());
			
			//Executa o comando sql no banco
			preparador.execute();
			
			//fechar conexão (encerrando objeto preparador)
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}	
	
}
