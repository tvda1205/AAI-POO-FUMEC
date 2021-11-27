
public class itemPedido extends Produto {
	protected Produto produto;
	protected Pedido Pedido;
	protected double valorItem;
	protected int qtdItem;
	protected String observacao;
	
	public itemPedido(Produto produto, Pedido pedido, int qtdItem, String observacao, float preco) {
		super(preco);
		this.produto = produto;
		Pedido = pedido;
		this.qtdItem = qtdItem;
		this.observacao = observacao;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	
	
	/*public double calcularValorItem(float preco) {
		valorItem = qtdItem*preco;
		
		return valorItem;
		
	}*/
}
