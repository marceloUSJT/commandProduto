package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	
	/**
	 * Método para tratar a requisição do usuário. Deve ser implementado pelas
	 * classes concretas, que implementam essa interface.
	 * 
	 * @see command.Command
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
}
