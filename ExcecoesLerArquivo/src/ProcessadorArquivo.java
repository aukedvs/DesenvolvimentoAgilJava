import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public ProcessadorArquivo() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<String, String> processar(String arquivo) throws LeituraArquivoException{
		
		Map<String, String> informacoes = new HashMap<String, String>();
		
		File file = new File(arquivo);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()){
				String linha = sc.nextLine();
				String infoChaveValor[];
				infoChaveValor = ProcessadorArquivo.processaLinha(linha);
				informacoes.put(infoChaveValor[0], infoChaveValor[1]);
			}
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo");
		}
		
		if(informacoes.isEmpty()){
			throw new LeituraArquivoException("Arquivo vazio");
		}
		
		return informacoes;		
	
	}
	
	
	private static String[] processaLinha(String linha) throws LeituraArquivoException{
	
		String infoChaveValor[] = linha.split("->");
		
		if(infoChaveValor.length != 2){
			throw new LeituraArquivoException("Formato de arquivo inválido");
		}
		
		if(!infoChaveValor[0].equals("nome") && !infoChaveValor[0].equals("sobrenome") && !infoChaveValor[0].equals("idade")){
			throw new LeituraArquivoException("Formato de arquivo inválido");
		}
		
		return infoChaveValor;
	
	}
	

}
