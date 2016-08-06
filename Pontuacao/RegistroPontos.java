
public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	RegistroPontos(CalculadoraBonus bonus) {
		this.bonus = bonus;
	}
	
	
	public void fazerUmComentario(Usuario usuario){
		usuario.pontos += 3 * bonus.bonusDoUsuario(usuario);
	}
	
	public void criarUmTopico(Usuario usuario){
		usuario.pontos += 5 * bonus.bonusDoUsuario(usuario);
	}
	
	public void darUmLike(Usuario usuario){
		usuario.pontos += 1 * bonus.bonusDoUsuario(usuario);
	}
}
