
public class ProdutoImportado extends Produto{
	
	private double custoImport;
	
	public ProdutoImportado() {
	}
	
	public ProdutoImportado(String nome, double preco, double custoImport) {
		super(nome, preco);
		this.custoImport = custoImport;
	}

	public double getCustoImport() {
		return custoImport;
	}

	public void setCustoImport(double custoImport) {
		this.custoImport = custoImport;
	}

	public double precoTagado(double precoTagado ) {
		return precoTagado;
	}
	
	public String precoTagado() {
		return getNome() + " R$ " + getPreco() + " R$ " + custoImport ;
	}
}
