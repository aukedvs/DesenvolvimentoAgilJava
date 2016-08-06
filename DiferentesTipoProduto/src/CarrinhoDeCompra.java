import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompra {
	
	Map<Produto, Integer> itensCarrinho = new HashMap<Produto, Integer>();
	
	public void adicionaProduto(Produto produto){
		
		int qtdeItem = 0;
		
		if (itensCarrinho.containsKey(produto)) {
			qtdeItem = itensCarrinho.get(produto);
			qtdeItem += 1;
			itensCarrinho.put(produto, qtdeItem);
		}
		else{
			itensCarrinho.put(produto, 1);
		}
	}
	
	public void removeProduto(Produto produto, int quantidade){
		int qtdeItem = 0;
		
		if (itensCarrinho.containsKey(produto)) {
			qtdeItem = itensCarrinho.get(produto);
			if (qtdeItem < quantidade) {
				itensCarrinho.remove(produto);
			}
			else{
				qtdeItem -= quantidade;
			}			
			itensCarrinho.put(produto, qtdeItem);
		}
	}
	
	public double totalCompra(){
		double totalCompra = 0;
		
		for(Produto produto : itensCarrinho.keySet()){
			totalCompra += itensCarrinho.get(produto) * produto.preco;
		}
		
		return totalCompra;
	}
	
}
