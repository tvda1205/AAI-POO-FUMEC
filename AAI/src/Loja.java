import java.util.ArrayList;

public class Loja {
	protected String nome;
	protected ArrayList<Produto> produto;
	protected String cnpj;
	protected String descricao;
	protected boolean aberto;
	
	public Loja(String nome, String cnpj, String descricao) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.descricao = descricao;
	}
	
	
}
