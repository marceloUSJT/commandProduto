package service;
import model.Produto;
import dao.ProdutoDAO;

public class ProdutoService implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoService() {
		this.produtoDAO = new ProdutoDAO();
	}
	
	public void cadastrarProduto(Produto prod) {	
		produtoDAO.cadastrar(prod);
	}
	
	public void excluirProduto(Produto prod) {
		produtoDAO.excluir(prod);
	}
	
	public void alterarProduto(Produto prod) {
		produtoDAO.alterar(prod);
	}
		
}