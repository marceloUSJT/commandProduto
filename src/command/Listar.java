package command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

public class Listar implements Command{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoService produtoService = new ProdutoService();
		// Recebendo os par�metros:
		List<Produto> listaProduto = produtoService.listarProdutos();
		// Instaciando e populando JavaBean de Produto:
		
		// Instanciando uma Service de Produto:
		
		// Solicitando � service que registre o produto no banco:
		// Antes de despachar o usu�rio, adicionar um atribut� requisi��o:
		// Despachar o usuario � parte de vis�o (apresenta��o - view):
		RequestDispatcher view = request.getRequestDispatcher("index.html");
		view.forward(request, response);
		
	}

}
