
public class Contato {
	
	protected int valor;
	
	protected enum tipoContato {
		EMAIL(1), WHATSAPP(2), TELEFONE(3);
		
		public int valorContato;
		tipoContato(int valor) {
			valorContato = valor;
		}
		
	}

	
	
	

}
