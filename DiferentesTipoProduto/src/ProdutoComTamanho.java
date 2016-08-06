
public class ProdutoComTamanho extends Produto {
	int tamanho;
	
	public ProdutoComTamanho(int codigo, String nome, int tamanho) {
		super(codigo, nome);
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + codigo + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ProdutoComTamanho))
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (codigo != other.codigo || tamanho != other.tamanho)
			return false;
		return true;
	}

}
