import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProduto {

	@Test
	public void testeEqualsCodigoIgual() {
		Produto produto1 = new Produto(10,"Teste");
		produto1.preco = 25.5;
		
		Produto produto2 = new Produto(10,"Teste 2");
		produto2.preco = 50;
		
		assertEquals(true, produto1.equals(produto2));
	}
	
	@Test
	public void testeEqualsCodigoDiferente() {
		Produto produto1 = new Produto(12,"Teste");
		produto1.preco = 25.5;
		
		Produto produto2 = new Produto(10,"Teste 2");
		produto2.preco = 50;
		
		assertEquals(false, produto1.equals(produto2));
	}
	
	@Test
	public void testeHashCodeCodigoIgual() {
		Produto produto1 = new Produto(10,"Teste");
		produto1.preco = 25.5;
		
		Produto produto2 = new Produto(10,"Teste 2");
		produto2.preco = 50;
		
		assertEquals(produto2.hashCode(), produto1.hashCode());
	}

}
