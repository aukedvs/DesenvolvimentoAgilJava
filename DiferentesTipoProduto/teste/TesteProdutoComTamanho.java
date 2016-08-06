import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testeEqualsCodigoIgualTamanhoIgual() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho(10,"Teste",38);
		produto1.preco = 25.5;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho(10,"Teste 2",38);
		produto2.preco = 50;
		
		assertEquals(true, produto1.equals(produto2));
	}
	
	@Test
	public void testeEqualsCodigoIgualTamanhoDiferente() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho(10,"Teste",38);
		produto1.preco = 25.5;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho(10,"Teste 2",41);
		produto2.preco = 50;
		
		assertEquals(false, produto1.equals(produto2));
	}
	
	@Test
	public void testeEqualsCodigoDiferente() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho(12,"Teste",38);
		produto1.preco = 25.5;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho(10,"Teste 2",38);
		produto2.preco = 50;
		
		assertEquals(false, produto1.equals(produto2));
	}
	
	@Test
	public void testeHashCodeCodigoIgualTamahoIgual() {
		ProdutoComTamanho produto1 = new ProdutoComTamanho(10,"Teste",40);
		produto1.preco = 25.5;
		
		ProdutoComTamanho produto2 = new ProdutoComTamanho(10,"Teste 2",40);
		produto2.preco = 50;
		
		assertEquals(produto2.hashCode(), produto1.hashCode());
	}
	
}
