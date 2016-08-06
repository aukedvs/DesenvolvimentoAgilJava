
public class Principal2 {

	public static void main(String[] args) {
		
		Somador soma1 = new Somador();
		soma1.nome = "Soma1";
		Somador soma2 = new Somador();
		soma2.nome = "Soma2";
		Somador soma3 = new Somador();
		soma3.nome = "Soma3";
		
		for (int i = 0; i <= 3; i++) {
			soma1.somar();
			soma2.somar();
			soma3.somar();
		}
		
		soma1.imprimir();
		soma2.imprimir();
		soma3.imprimir();

	}

}
