
public class CompraParcelada extends Compra {

	private int quantidadeParcela;
	private double juros;
	
	public CompraParcelada(double valorCompra, int quantidadeParcela, double juros) {
		super(valorCompra);
		this.quantidadeParcela = quantidadeParcela;
		this.juros = juros;
	}

	@Override
	public double total() {
		
		double total = super.total(); 
		
		total = total * Math.pow((1 + this.juros), this.quantidadeParcela);
		
		return total;
	}

}
