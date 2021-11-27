import java.time.LocalDateTime;

public class Produto {
	protected String nome;
	protected String descricao;
	protected float preco;
	protected boolean disponivel;
	protected LocalDateTime tempoMedioPreparo;
	
	public Produto(String nome, String descricao, float preco, LocalDateTime tempoMedioPreparo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.tempoMedioPreparo = tempoMedioPreparo;
	}
	
	public Produto(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
