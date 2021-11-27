import java.util.ArrayList;

public class Cliente extends Pessoa {
	protected String login;
	protected String password;
	protected String formaPagamento;
	protected String cpf;
	protected Endereco endereço;
	protected ArrayList<Contato> contatos;
	
	
	public Cliente(String nome, String login, String password, String formaPagamento, String cpf) {
		super(nome);
		this.formaPagamento = formaPagamento;
		this.cpf = cpf;
		this.login = login;
		this.password = password;
	}
	
	
}
