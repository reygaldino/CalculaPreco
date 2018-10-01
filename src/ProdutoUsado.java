import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = new Date();
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public String precoTagado() {
		return getNome()+ " R$ " + getPreco() +" - " + sdf.format(dataFabricacao);
	}
}