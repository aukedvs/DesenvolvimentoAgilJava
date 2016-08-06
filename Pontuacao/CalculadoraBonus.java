
public class CalculadoraBonus {
	
	public int bonusDoDia = 1;
	
	public int bonusDoUsuario(Usuario usuario){
		int multiplicador = this.bonusDoDia;
		if(usuario.vip){
			multiplicador = 5 * multiplicador;
		}
		
		return multiplicador;		
	}
	
}
