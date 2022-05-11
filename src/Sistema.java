import exemplo.Lote;
import exemplo.Produto;
import exemplo.RepositorioProduto;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");

		Lote lote = new Lote(produto, 10L);

		RepositorioProduto catalogo = new RepositorioProduto();
		
		System.out.println(produto);
		System.out.println(lote);

		Produto wheyProtein = new Produto("Whey Protein", "Growth");
		Produto hipercalorico = new Produto("Hipercalorico", "Max Titanium");
		Produto tangerina = new Produto("Tangerina", "Deus");

		catalogo.addProduto(wheyProtein);
		catalogo.addProduto(hipercalorico);
		catalogo.addProduto(tangerina);
	}
}
