
public class VerificadoraNotas {

	public static int mediaAluno(Aluno aluno){
		int total = 0;
		
		total += aluno.primeiroBimestre;
		total += aluno.segundoBimestre;
		total += aluno.terceiroBimestre;
		total += aluno.quartoBimestre;
		
		return total/4;
	}
	
	public static boolean passouAno (Aluno aluno){
		int media = mediaAluno(aluno);
		
		if (media >= 60) {
			return true;
		}else{
			return false;
		}
	}
}
