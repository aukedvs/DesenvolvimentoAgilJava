import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroDePontos {

	@Test
	public void pontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.nome = "Diogo";
		CalculadoraBonus bonus = new CalculadoraBonus();
		RegistroPontos registraPontos = new RegistroPontos(bonus);
		registraPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoVip() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabriel";
		usuario.vip = true;
		CalculadoraBonus bonus = new CalculadoraBonus();
		RegistroPontos registraPontos = new RegistroPontos(bonus);
		registraPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.nome = "Diogo";
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 3;
		RegistroPontos registraPontos = new RegistroPontos(bonus);
		registraPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDiaVip() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabriel";
		usuario.vip = true;
		CalculadoraBonus bonus = new CalculadoraBonus();
		bonus.bonusDoDia = 2;
		RegistroPontos registraPontos = new RegistroPontos(bonus);
		registraPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 50);
	}

}
