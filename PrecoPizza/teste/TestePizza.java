import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestePizza {
	
	@After
	public void limpaTotalIngredientes(){
		Pizza.limpaTotalIngredientes();
	}
	
	@Test
	public void testePrecoUmIngrediente() {

		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Calabresa");
		assertEquals(15, calabresa.getPreco());
		
	}
	
	@Test
	public void testePrecoDoisIngredientes() {

		Pizza peperoni = new Pizza();
		peperoni.adicionaIngrediente("Calabresa");
		peperoni.adicionaIngrediente("Calabresa");
		peperoni.adicionaIngrediente("Calabresa");
		peperoni.adicionaIngrediente("Queijo");
		assertEquals(15, peperoni.getPreco());
		
	}
	
	@Test
	public void testePrecoTresIngredientes() {

		Pizza portuguesa = new Pizza();
		portuguesa.adicionaIngrediente("Queijo");
		portuguesa.adicionaIngrediente("Pimentao");
		portuguesa.adicionaIngrediente("Cebola");
		portuguesa.adicionaIngrediente("Calabresa");
		assertEquals(20, portuguesa.getPreco());
		
	}
	
	@Test
	public void testePrecoSeisIngredientes() {

		Pizza frango = new Pizza();
		frango.adicionaIngrediente("Frango");
		frango.adicionaIngrediente("Catupiri");
		frango.adicionaIngrediente("Queijo");
		frango.adicionaIngrediente("Presunto");
		frango.adicionaIngrediente("Cebola");
		frango.adicionaIngrediente("Tomate");
		assertEquals(23, frango.getPreco());
	
	}
	
	@Test
	public void testeTotalIngredientes(){
		
		int qtdeQueijo = 0;
		int qtdePeperoni = 0;
		int qtdePimentao = 0;
		int qtdeCebola = 0;
		int qtdeCalabresa = 0;
		int qtdeFrango = 0;
		int qtdeCatupiri = 0;
		int qtdePresunto = 0;
		int qtdeTomate = 0;
		
		Pizza peperoni = new Pizza();
		peperoni.adicionaIngrediente("Peperoni");
		peperoni.adicionaIngrediente("Queijo");
	
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
	
		qtdeQueijo = Pizza.totalIngredientes.get("Queijo");
		qtdePeperoni = Pizza.totalIngredientes.get("Peperoni");
		qtdePimentao = Pizza.totalIngredientes.get("Pimentao");
		qtdeCebola = Pizza.totalIngredientes.get("Cebola");
		qtdeCalabresa = Pizza.totalIngredientes.get("Calabresa");
		qtdeFrango = Pizza.totalIngredientes.get("Frango");
		qtdeCatupiri = Pizza.totalIngredientes.get("Catupiri");
		qtdePresunto = Pizza.totalIngredientes.get("Presunto");
		qtdeTomate = Pizza.totalIngredientes.get("Tomate");
		
		assertEquals(3, qtdeQueijo);
		assertEquals(1, qtdePeperoni);
		assertEquals(1, qtdePimentao);
		assertEquals(2, qtdeCebola);
		assertEquals(1, qtdeCalabresa);
		assertEquals(1, qtdeFrango);
		assertEquals(1, qtdeCatupiri);
		assertEquals(1, qtdePresunto);
		assertEquals(1, qtdeTomate);
	
	}
	
	
}
