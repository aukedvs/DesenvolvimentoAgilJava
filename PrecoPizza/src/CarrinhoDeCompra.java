import java.util.ArrayList;

public class CarrinhoDeCompra {
	
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public void adicionarPizza(Pizza pizza){
		
		if(pizza.temIngredientes()){
			this.pizzas.add(pizza);
		}
	
	}
	
	public int totalCompra(){
		int totalCompra = 0;
		
		for(Pizza pizza : pizzas){
			totalCompra += pizza.getPreco();
		}
		
		return totalCompra;
	}
	
}
