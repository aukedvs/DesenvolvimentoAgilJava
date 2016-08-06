public class Principal {

	public static void main(String[] args) {
	
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Calabresa");
			
		Pizza portuguesa = new Pizza();
		portuguesa.adicionaIngrediente("Queijo");
		portuguesa.adicionaIngrediente("Pimentao");
		portuguesa.adicionaIngrediente("Cebola");
		portuguesa.adicionaIngrediente("Calabresa");

		Pizza frango = new Pizza();
		frango.adicionaIngrediente("Frango");
		frango.adicionaIngrediente("Catupiri");
		frango.adicionaIngrediente("Queijo");
		frango.adicionaIngrediente("Presunto");
		frango.adicionaIngrediente("Cebola");
		frango.adicionaIngrediente("Tomate");

		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		carrinho.adicionarPizza(calabresa);
		carrinho.adicionarPizza(portuguesa);
		carrinho.adicionarPizza(frango);
		
		System.out.println("O preço total da compra é " + carrinho.totalCompra());
		
		for(String ingrediente : Pizza.totalIngredientes.keySet()){
			System.out.println(ingrediente + " = " + Pizza.totalIngredientes.get(ingrediente));
		}
		
	}

}
