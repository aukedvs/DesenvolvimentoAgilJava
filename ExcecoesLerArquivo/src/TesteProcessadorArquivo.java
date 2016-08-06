import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TesteProcessadorArquivo {

	@Test
	public void testeLeituraArquivoSucesso() throws LeituraArquivoException {
		
		Map<String, String> informacoes = ProcessadorArquivo.processar("arquivoCorreto.txt");
		assertEquals("Diogo", informacoes.get("nome"));
	}
	
	@Test
	public void testeLeituraArquivoNaoExiste() {
		
		Map<String, String> informacoes = null;
		
		try {
			informacoes = ProcessadorArquivo.processar("arquivoNaoExiste.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Erro ao abrir o arquivo", e.getMessage());
		}
	}

	@Test
	public void testeLeituraArquivoVazio() {
		
		Map<String, String> informacoes = null;
		
		try {
			informacoes = ProcessadorArquivo.processar("arquivoVazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Arquivo vazio", e.getMessage());
		}
	}
	
	@Test
	public void testeLeituraArquivoInvalido() {
		
		Map<String, String> informacoes = null;
		
		try {
			informacoes = ProcessadorArquivo.processar("arquivoInvalido.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido", e.getMessage());
		}
	}
	
}
