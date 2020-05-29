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
		// Recebendo os parâmetros:
		List<Produto> listaProduto = produtoService.listarProdutos();
		// Instaciando e populando JavaBean de Produto:
		
		// Instanciando uma Service de Produto:
		
		// Solicitando à service que registre o produto no banco:
		// Antes de despachar o usuário, adicionar um atributà requisição:
		// Despachar o usuario à parte de visão (apresentação - view):
		RequestDispatcher view = request.getRequestDispatcher("index.html");
		view.forward(request, response);
		
	}

}
