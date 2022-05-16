package exemplo;

import java.util.List;

public class ProdutoService {

    RepositorioProduto prodRep;
    RepositorioLote loteRep;

    public List<Produto> listarProdutosLote(String nome) {
        List<Lote> lotes = loteRep.getAll();
        List<Produto> prods = getProdsDeLotes(lotes);
        List<Produto> prodsok = getProdsPeloNome(nome, prods);
    }

    public List<Produto> listarProdutoPeloNome(String nome) {
        List<Produto> prods = prodRep.getAll();
        List<Produto> prodok = getProdsPeloNome(nome, prods);
    }
}
