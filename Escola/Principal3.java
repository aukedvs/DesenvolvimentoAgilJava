
public class Principal3 {

	public static void main(String[] args) {
		Aluno diogo = new Aluno();
		diogo.primeiroBimestre = 70;
		diogo.segundoBimestre = 80;
		diogo.terceiroBimestre = 60;
		diogo.quartoBimestre = 90;
		
		System.out.println("Media " + diogo.media());
		System.out.println("Passou de ano " + diogo.passouAno());
		
	}

}
