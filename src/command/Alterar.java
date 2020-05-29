package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Produto;
import service.ProdutoService;

public class Alterar implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recebendo os parâmetros:
		// Instanciando e populando JavaBean de Produto:
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setEstoque(Integer.parseInt(request.getParameter("estoque")));

		// Instanciando uma Service de Produto:
		ProdutoService produtoService = new ProdutoService();

		// Solicitando à service que registre o produto no banco:
		produtoService.atualizarProduto(produto);	
		
		// Antes de despachar o usuário, adicionar um atributà requisição:
		 request.setAttribute("mensagem", "O produto foi alterado com sucesso!");
		 
		// Despachar o usuario à parte de visão (apresentação - view):
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}
}
