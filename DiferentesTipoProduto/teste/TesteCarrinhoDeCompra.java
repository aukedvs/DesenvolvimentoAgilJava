import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompra {

	Produto produto1;
	Produto produto2;
	Produto produto3;
	
	ProdutoComTamanho produtoTamanho1;
	ProdutoComTamanho produtoTamanho2;
	ProdutoComTamanho produtoTamanho3;
	
	CarrinhoDeCompra carrinho;
	
	@Before
	public void inicializaProdutos(){
		
		produto1 = new Produto(10, "Teste Produto 1");
		produto1.preco = 100;
		produto2 = new Produto(10, "Teste Produto 2");
		produto2.preco = 100;
		produto3 = new Produto(15, "Teste Produto 3");
		produto3.preco = 200;
		
		produtoTamanho1 = new ProdutoComTamanho(10, "Teste Produto 1",38);
		produtoTamanho1.preco = 150;
		produtoTamanho2 = new ProdutoComTamanho(10, "Teste Produto 2",38);
		produtoTamanho2.preco = 150;
		produtoTamanho3 = new ProdutoComTamanho(10, "Teste Produto 3",40);
		produtoTamanho3.preco = 150;
		
		carrinho = new CarrinhoDeCompra();
	}
	
	@Test
	public void testeAdicionaProduto() {
		
		carrinho.adicionaProduto(produto1);
		carrinho.adicionaProduto(produto2);
		carrinho.adicionaProduto(produto3);
		
		int qtdeProdutoCod10 = carrinho.itensCarrinho.get(produto1);
		int qtdeProdutoCod15 = carrinho.itensCarrinho.get(produto3);
		
		assertEquals(2, qtdeProdutoCod10);
		assertEquals(1, qtdeProdutoCod15);
		
	}
	
	@Test
	public void testeAdicionaProdutoComTamanho() {
		
		carrinho.adicionaProduto(produtoTamanho1);
		carrinho.adicionaProduto(produtoTamanho2);
		carrinho.adicionaProduto(produtoTamanho3);
		
		int qtdeProdutoCod10Tam38 = carrinho.itensCarrinho.get(produtoTamanho1);
		int qtdeProdutoCod10Tam40 = carrinho.itensCarrinho.get(produtoTamanho3);
		
		assertEquals(2, qtdeProdutoCod10Tam38);
		assertEquals(1, qtdeProdutoCod10Tam40);
		
	}
	
	@Test
	public void testeRemoveProdutoComTamanho() {
		
		ProdutoComTamanho produtoRemover = new ProdutoComTamanho(10, "Teste Produto Remove", 38);

		carrinho.adicionaProduto(produtoTamanho1);
		carrinho.adicionaProduto(produtoTamanho2);
		carrinho.adicionaProduto(produtoTamanho3);
		
		carrinho.removeProduto(produtoRemover, 1);
		
		int qtdeProdutoCod10Tam38 = carrinho.itensCarrinho.get(produtoTamanho1);
		int qtdeProdutoCod10Tam40 = carrinho.itensCarrinho.get(produtoTamanho3);
		
		assertEquals(1, qtdeProdutoCod10Tam38);
		assertEquals(1, qtdeProdutoCod10Tam40);
		
	}
	
	@Test
	public void testeTotalCompra() {
		
		carrinho.adicionaProduto(produto1);
		carrinho.adicionaProduto(produto2);
		carrinho.adicionaProduto(produto3);
		carrinho.adicionaProduto(produtoTamanho1);
		
		double totalCompra = carrinho.totalCompra();
		
		assertEquals(550.0, totalCompra,0.0);
		
	}

}
