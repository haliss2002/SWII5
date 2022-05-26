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

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String nome = request.getParameter("nome");
        String nomeOriginal = request.getParameter("nomeOriginal");
        String descricao = request.getParameter("descricao");
        String unidadeCompra = request.getParameter("unidadeCompra");
        String qtdPrevistoMes = request.getParameter("qtdPrevistoMes");
        String precoMaxComprado = request.getParameter("precoMaxComprado");

        DB banco = new DB();
        Produto produto = banco.buscaProdutoNome(nomeOriginal);
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setUnidadeCompra(Integer.parseInt(unidadeCompra));
        produto.setQtdPrevistoMes(Double.parseDouble(qtdPrevistoMes));
        produto.setPrecoMaxComprado(Double.parseDouble(precoMaxComprado));
        
		response.sendRedirect("listaProdutos");
        
	}
}
