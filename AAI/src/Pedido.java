import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	protected Cliente cliente;
	protected Loja loja;
	protected ArrayList<itemPedido> itemPedido;
	protected Entregador entregador;
	protected LocalDateTime tempoEstimado;
	
	public Pedido(Cliente cliente, Loja loja, ArrayList<itemPedido> itemPedido, Entregador entregador,
			LocalDateTime tempoEstimado) {
		super();
		this.cliente = cliente;
		this.loja = loja;
		this.itemPedido = itemPedido;
		this.entregador = entregador;
		this.tempoEstimado = tempoEstimado;
	}
	
	
	
}
