import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente {
	
	@Before
	public void inicializaConta(){
		contaCorrente = new ContaEspecial(100);
		contaCorrente.depositar(200);
	}
	
	@Test
	public void testeSacarMaisSaldo() {
		int sacado;
		sacado = contaCorrente.sacar(310);
		assertEquals(0, sacado);
		assertEquals(200, contaCorrente.saldo);
	}

	@Test
	public void testeSacarLimite() {
		int sacado;
		sacado = contaCorrente.sacar(210);
		assertEquals(210, sacado);
		assertEquals(-10, contaCorrente.saldo);
	}

	
}
