package tp02_2022_SWII5;
// Desenvolvido por 
// 
// Halisson de Oliveira Sousa CB3012051
// Marcel Crudelli            CB301181X
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");

		DB banco = new DB();
		Produto produto = banco.buscaProdutoNome(nome);
		
		request.setAttribute("produto", produto);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);
		
		
	}
}
