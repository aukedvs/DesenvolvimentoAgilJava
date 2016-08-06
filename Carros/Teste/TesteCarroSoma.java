import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarroSoma {
	
	CarroDeCorrida carro1;
	
	@Before
	public void inicializaCarro(){
		carro1 = new CarroSoma("Teste", 10, 100);
	}
	
	
	@Test
	public void testeCarroParado() {
		assertEquals(0, carro1.getVelocidade());
	}
	
	@Test
	public void testeAcelerar() {
		carro1.acelerar();
		assertEquals(10, carro1.getVelocidade());
	}
	
	@Test
	public void testeFrear() {
		carro1.acelerar();
		carro1.frear();
		assertEquals(5, carro1.getVelocidade());
	}
	
	@Test
	public void testeFrearAteZero() {
		carro1.acelerar();
		carro1.frear();
		carro1.frear();
		carro1.frear();
		carro1.frear();
		assertEquals(0, carro1.getVelocidade());
	}
	
	@Test
	public void testeAcelerarAteVelocidadeMaxima(){
		for (int i = 0; i < 14; i++) {
			carro1.acelerar();
		}
		assertEquals(100, carro1.getVelocidade());
	}
	
	

}
