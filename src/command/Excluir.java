package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

public class Excluir implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recebendo os par�metros:			
		// Instanciando e populando JavaBean de Produto:
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));

		//Instanciando uma Service de Produto:
		ProdutoService produtoService = new ProdutoService();
		
		
		//Solicitando � service que apague o produto no banco:
		produtoService.deletarProduto(produto);
		
		//Antes de despachar o usuario, adicionar um atributo � requisi��o:
		 request.setAttribute("mensagem", "O produto foi excluido com sucesso!");
		 
		//Despachar o usuario � parte de vis�o (apresenta��o - view):		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);

	}

}
