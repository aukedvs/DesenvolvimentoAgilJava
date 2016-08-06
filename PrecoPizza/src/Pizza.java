import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	
	private ArrayList<String> ingredientes = new ArrayList<String>();
	public static Map<String, Integer> totalIngredientes = new HashMap<String, Integer>();
	
	public void adicionaIngrediente(String ingrediente){
		
		if (!this.ingredientes.contains(ingrediente)) {
			this.ingredientes.add(ingrediente);
			Pizza.contabilizaIngrediente(ingrediente);
		}
	
	}
	
	private static void contabilizaIngrediente(String ingrediente){
		
		int qtdeAtualIngrediente = 0;
		
		if (Pizza.totalIngredientes.containsKey(ingrediente)){
			qtdeAtualIngrediente = Pizza.totalIngredientes.get(ingrediente);
			qtdeAtualIngrediente += 1;
			Pizza.totalIngredientes.put(ingrediente, qtdeAtualIngrediente);
		}
		else{
			Pizza.totalIngredientes.put(ingrediente, 1);
		}
	
	}
	
	public static void limpaTotalIngredientes(){
		Pizza.totalIngredientes.clear();
	}
	
	public int getPreco(){
		
		int qtdeIngredientes = this.ingredientes.size();
		int preco = 0;
		
		if(qtdeIngredientes <= 2){
			preco = 15;
		}
		else if (qtdeIngredientes >= 3 && qtdeIngredientes <= 5) {
			preco = 20;
		}
		else{
			preco = 23;
		}
		
		return preco;
	}
	
	public boolean temIngredientes(){
		
		int qtdeIngredientes = this.ingredientes.size();
		boolean temIngrediente = false;
		
		if(qtdeIngredientes > 0){
			temIngrediente = true;
		}
		
		return temIngrediente;
	}
	
}
