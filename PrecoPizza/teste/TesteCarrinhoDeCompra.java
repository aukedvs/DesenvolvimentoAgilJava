import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompra {

	@Test
	public void testeTotalPizza(){
		
		Pizza peperoni = new Pizza();
		peperoni.adicionaIngrediente("Peperoni");
		peperoni.adicionaIngrediente("Queijo");
	
		Pizza portuguesa = new Pizza();
		portuguesa.adicionaIngrediente("Queijo");
		portuguesa.adicionaIngrediente("Pimentao");
		portuguesa.adicionaIngrediente("Cebola");
		portuguesa.adicionaIngrediente("Calabresa");
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(peperoni);
		carrinho.adicionarPizza(portuguesa);
		assertEquals(35, carrinho.totalCompra());
	}
	
	@Test
	public void testePizzaSemIngredientes() {
		 
		int qtdePizzaAntes = 0;
		int qtdePizzaDepois = 0;
		 
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Calabresa");
		
		Pizza portuguesa = new Pizza();
		 
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(calabresa);
		qtdePizzaAntes = carrinho.pizzas.size();
		
		carrinho.adicionarPizza(portuguesa);
		qtdePizzaDepois = carrinho.pizzas.size();
		
		assertEquals(qtdePizzaAntes, qtdePizzaDepois);
	}

}
