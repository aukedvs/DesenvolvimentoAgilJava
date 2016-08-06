import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {

	ContaCorrente contaCorrente;
	
	@Before
	public void inicializaConta(){
		contaCorrente = new ContaCorrente();
		contaCorrente.depositar(200);
	}
	
	@Test
	public void testeDeposito() {
		contaCorrente.depositar(200);
		assertEquals(400, contaCorrente.saldo);
	}
	
	@Test
	public void testeSacar() {
		int sacado;
		sacado = contaCorrente.sacar(50);
		assertEquals(50, sacado);
		assertEquals(150, contaCorrente.saldo);
	}
	
	@Test
	public void testeSacarMaisSaldo() {
		int sacado;
		sacado = contaCorrente.sacar(210);
		assertEquals(0, sacado);
		assertEquals(200, contaCorrente.saldo);
	}

}
