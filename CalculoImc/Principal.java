
public class Principal {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(1.73,64);
		Paciente paciente2 = new Paciente(1.56,54);
		Paciente paciente3 = new Paciente(1.40,34);
		
		System.out.println("O diagnostico do paciente 1 � " + paciente1.diagnostico());
		System.out.println("O diagnostico do paciente 2 � " + paciente2.diagnostico());
		System.out.println("O diagnostico do paciente 3 � " + paciente3.diagnostico());
	}
}
