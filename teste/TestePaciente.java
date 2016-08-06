import static org.junit.Assert.*;

import org.junit.Test;

public class TestePaciente {

	@Test
	public void testeBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(1.5, 35);
		assertEquals(15.56, paciente.calcularIMC(),0.01);
	}
	
	@Test
	public void testeDiagBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(1.5, 35);
		assertEquals("Baixo peso muito grave", paciente.diagnostico());
	}
	
	@Test
	public void testeBaixoPesoGrave() {
		Paciente paciente = new Paciente(1.5, 38);
		assertEquals(16.89, paciente.calcularIMC(),0.01);
	}
	
	@Test
	public void testeDiagBaixoPesoGrave() {
		Paciente paciente = new Paciente(1.5, 38);
		assertEquals("Baixo peso grave", paciente.diagnostico());
	}
	
	@Test
	public void testeBaixoPeso() {
		Paciente paciente = new Paciente(1.73, 55);
		assertEquals(18.38, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagBaixoPeso() {
		Paciente paciente = new Paciente(1.73, 55);
		assertEquals("Baixo peso", paciente.diagnostico());
	}
	
	@Test
	public void testePesoNormal() {
		Paciente paciente = new Paciente(1.73, 65);
		assertEquals(21.72, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagPesoNormal() {
		Paciente paciente = new Paciente(1.73, 65);
		assertEquals("Peso normal", paciente.diagnostico());
	}
	
	@Test
	public void testeSobrepeso() {
		Paciente paciente = new Paciente(1.50, 65);
		assertEquals(28.89, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagSobrepeso() {
		Paciente paciente = new Paciente(1.50, 65);
		assertEquals("Sobrepeso", paciente.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauI() {
		Paciente paciente = new Paciente(1.73, 95);
		assertEquals(31.74, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagObesidadeGrauI() {
		Paciente paciente = new Paciente(1.73, 95);
		assertEquals("Obesidade grau I", paciente.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauII() {
		Paciente paciente = new Paciente(1.6, 95);
		assertEquals(37.11, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagObesidadeGrauII() {
		Paciente paciente = new Paciente(1.6, 95);
		assertEquals("Obesidade grau II", paciente.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauIII() {
		Paciente paciente = new Paciente(1.6, 110);
		assertEquals(42.97, paciente.calcularIMC(),0.00);
	}
	
	@Test
	public void testeDiagObesidadeGrauIII() {
		Paciente paciente = new Paciente(1.6, 110);
		assertEquals("Obesidade grau III (obesidade mórbida)", paciente.diagnostico());
	}

}
