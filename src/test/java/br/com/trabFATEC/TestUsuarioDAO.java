package br.com.trabFATEC;

import br.com.trabFATEC.entidade.Usuario;
import br.com.trabFATEC.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aqui posso chamar os metodos
	     testExcluir();
	
	}

	public static void testCadastrar(){
		//criando o usuario
		Usuario usu = new Usuario();
		usu.setNome("Carlos");
		usu.setLogin("CarlosTadeu");
        usu.setSenha("12345");
        
        //cadastrando usuario no banco de dados
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.cadastrar(usu);
        
        System.out.println("Cadastrado com Sucesso!");		
	}
	
	public static void testAlterar(){
		//criando o usuario
		Usuario usu = new Usuario();
		usu.setId_usuario(10);
		usu.setNome("Jeferson");
		usu.setLogin("Onapolis");
        usu.setSenha("123456");
        
        //cadastrando usuario no banco de dados
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.alterar(usu);
        
        System.out.println("Alterado com Sucesso!");
	
	}
	
	public static void testExcluir(){
		//criando o usuario
		Usuario usu = new Usuario();
		usu.setId_usuario(10);

        
        //cadastrando usuario no banco de dados
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.excluir(usu);
        
        System.out.println("Excluido com sucesso com Sucesso!");
	
	}
}