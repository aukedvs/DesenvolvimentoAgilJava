
public class Principal {

	public static void main(String[] args) {
		Corrida interlagos = new Corrida(2000);
		interlagos.adicionaCarroCorrida(new CarroSoma("Mercedes", 10, 110));
		interlagos.adicionaCarroCorrida(new CarroSoma("Ferrari", 8, 140));
		interlagos.adicionaCarroCorrida(new CarroMultiplica("Masserati", 1.7, 100));
		interlagos.adicionaCarroCorrida(new CarroMultiplica("Toyota", 1.4, 110));
		
		interlagos.umDoisTresEJa();
		
	}

}
