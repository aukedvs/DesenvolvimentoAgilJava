import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testeCompraParcelada1() {
		CompraParcelada compra = new CompraParcelada(10000, 1, 0.02);
		assertEquals(10200.00, compra.total(),0.0);
	}
	
	@Test
	public void testeCompraParcelada2() {
		CompraParcelada compra = new CompraParcelada(10000, 2, 0.02);
		assertEquals(10404.00, compra.total(),0.0);
	}
	
	@Test
	public void testeCompraParcelada5() {
		CompraParcelada compra = new CompraParcelada(10000, 5, 0.02);
		assertEquals(11040.81, compra.total(),0.01);
	}
	
	@Test
	public void testeCompraParcelada10() {
		CompraParcelada compra = new CompraParcelada(10000, 10, 0.02);
		assertEquals(12189.94, compra.total(),0.01);
	}

}
