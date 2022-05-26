package tp02_2022_SWII5;
// Desenvolvido por 
// 
// Halisson de Oliveira Sousa CB3012051
// Marcel Crudelli            CB301181X

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DB {

	private static List<Produto> listaProdutos = new ArrayList<>();
	
	static {
		Produto produto = new Produto();
		Produto produto2 = new Produto();
		produto.setNome("Produto1");
		produto2.setNome("Produto2");
		listaProdutos.add(produto);
		listaProdutos.add(produto2);
	}

	public void adicionaProduto(Produto produto) {
		DB.listaProdutos.add(produto);
	}

	public List<Produto> getListaProdutos() {
		return DB.listaProdutos;
	}

	public void removeProduto(String nome) {
		
		Iterator<Produto> it = listaProdutos.iterator();
	

		while(it.hasNext()) {
			Produto pro = it.next();
			String produtoNome = pro.getNome().toUpperCase().strip();

			if(produtoNome.equals(nome.toUpperCase().strip())) {
				it.remove();
			}
		}
		
	}

	public Produto buscaProdutoNome(String nome) {
		for(Produto produto : listaProdutos) {
			String produtoNome = produto.getNome().toUpperCase().strip();
			if(produtoNome.equals(nome.toUpperCase().strip())) {
				return produto;
			}
		}
		return null;
	}
}
