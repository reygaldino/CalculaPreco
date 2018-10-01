import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws ParseException {
		ArrayList<Produto> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++)  {
		System.out.print("O produto é Comum, usado ou importado: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Nome do produto: ");
		String nome1 = sc.nextLine();
		System.out.print("Preço do Produto: ");
		double preco = sc.nextDouble();
			if(nome.equals("importado")) {
				System.out.print("Custo do Produto importado: ");
				double custoImport = sc.nextDouble();
				lista.add(new ProdutoImportado(nome1, preco, custoImport));
			}else if(nome.equals("usado")){
				System.out.print("Informe a data de fabricação (DD/MM/AAAA): ");
				Date dataFabricacao = sdf.parse(sc.next()); 
				lista.add(new ProdutoUsado(nome1, preco, dataFabricacao));
			}else {
				lista.add(new Produto(nome1, preco));
			}
		}
		for (Produto produto : lista) {
			System.out.println(produto.precoTagado());
		}
	}

}
