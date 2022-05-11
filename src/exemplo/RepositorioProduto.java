package exemplo;
import java.util.HashMap;
import java.util.Map;

public class RepositorioProduto {

    private Map<String, Produto> catalogo;

    public RepositorioProduto() {
        this.catalogo = new HashMap<String, Produto>();
    }

    public String addProduto(Produto p) {
        catalogo.put(p.getId(), p).getId();
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
