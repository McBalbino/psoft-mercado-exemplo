package exemplo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class RepositorioProduto {

    private Map<String, Produto> catalogo;

    public RepositorioProduto() {
        this.catalogo = new HashMap<String, Produto>();
    }

    public String addProduto(Produto p) {
        catalogo.put(p.getId(), p).getId();
    }

    public List<Produto> listaProduto(String produtoProcurado) {
        List<Produto> prods = new ArrayList<Produto>();
        for (Produto p: catalogo.values()) {
            if (p.getNome().contains(produtoProcurado)) {
                prods.add(p);
            }
        }
        return prods;
    }

    public void updateProduto(Produto idProd, String novoNome, String novoFabricante) {
        Produto prod = catalogo.get(idProd);
        prod.setNome(novoNome);
        prod.setFabricante(novoFabricante);
    }

    public String removeProduto(Produto idProd) {
        return catalogo.remove(idProd).getId();
    }
}
