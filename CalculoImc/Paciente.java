
public class Paciente {
	
	private double altura = 0;
	private double peso = 0;
	
	Paciente(double altura, double peso){
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calcularIMC(){
		
		double indiceMassaCorporal = 0;
		
		indiceMassaCorporal = this.peso / Math.pow(this.altura, 2);
		
		return indiceMassaCorporal;
		
	}
	
	public String diagnostico(){
		
		double indiceMassaCorporal = this.calcularIMC();
		String diagnostico = "";
		
		if(indiceMassaCorporal < 16){
			diagnostico = "Baixo peso muito grave";
		}else if (indiceMassaCorporal >= 16 && indiceMassaCorporal <= 16.99) {
			diagnostico = "Baixo peso grave";
		}else if (indiceMassaCorporal >= 17 && indiceMassaCorporal <= 18.49) {
			diagnostico = "Baixo peso";
		}else if (indiceMassaCorporal >= 18.49 && indiceMassaCorporal <= 24.99) {
			diagnostico = "Peso normal";
		}else if (indiceMassaCorporal >= 25 && indiceMassaCorporal <= 29.99) {
			diagnostico = "Sobrepeso";
		}else if (indiceMassaCorporal >= 30 && indiceMassaCorporal <= 34.99) {
			diagnostico = "Obesidade grau I";
		}else if (indiceMassaCorporal >= 35 && indiceMassaCorporal <= 39.99) {
			diagnostico = "Obesidade grau II";
		}else if (indiceMassaCorporal >= 40) {
			diagnostico = "Obesidade grau III (obesidade mórbida)";
		}

		return diagnostico;
	}

}
