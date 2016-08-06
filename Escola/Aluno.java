
public class Aluno {
	int primeiroBimestre;
	int segundoBimestre;
	int terceiroBimestre;
	int quartoBimestre;
	
	public int media(){
		int total = 0;
		
		total += this.primeiroBimestre;
		total += this.segundoBimestre;
		total += this.terceiroBimestre;
		total += this.quartoBimestre;
		
		return total/4;
	}
	
	public boolean passouAno (){
		int media = this.media();
		
		if (media >= 60) {
			return true;
		}else{
			return false;
		}
	}

}
