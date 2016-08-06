import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Pessoa {

	private Date dataDeNascimento;
	private Map<String, Date> signosDataInicio = new HashMap<String, Date>();
	private Map<String, Date> signosDataFim = new HashMap<String, Date>();
	
	public Pessoa(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade(){
		Date dataAtual = new Date();
		int idade = 0;
		
		idade = dataAtual.getYear() - this.dataDeNascimento.getYear();
		
		if (dataAtual.getMonth() < this.dataDeNascimento.getMonth()){
			idade--;
		}
		else if(dataAtual.getMonth() == this.dataDeNascimento.getMonth() && 
				dataAtual.getDate() < this.dataDeNascimento.getDate()){
			idade--;
		}
		
		return idade;
	}

	public String getSigno(){
		String signo = "";
		
		
		
		return signo;
	}
	
}
