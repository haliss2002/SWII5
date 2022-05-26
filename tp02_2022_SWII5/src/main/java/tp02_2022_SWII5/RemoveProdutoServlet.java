package tp02_2022_SWII5;
// Desenvolvido por 
// 
// Halisson de Oliveira Sousa CB3012051
// Marcel Crudelli            CB301181X


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeProduto")
public class RemoveProdutoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DB banco = new DB();
		String nome = request.getParameter("nome");
					
		banco.removeProduto(nome);
		response.sendRedirect("listaProdutos");
	}

}
