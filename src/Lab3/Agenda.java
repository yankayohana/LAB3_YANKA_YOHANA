package Lab3;

/**
 * 
 * @author yanka yohana
 *
 */
public class Agenda {
	private Contato[] contatos;

	public Agenda() {
		this.contatos = new Contato[100];
	}

	public boolean cadastraContato(String nomeContato, String sobrenomeContato, String telefoneContato,
			int posicaoContato) {
		Contato contato = new Contato(nomeContato, sobrenomeContato, telefoneContato, posicaoContato);
		this.contatos[posicaoContato] = contato;
		if (nomeContato.equals("") || sobrenomeContato.equals("") || telefoneContato.equals("") || posicaoContato < 1
				|| posicaoContato > 100) {
			return false;

		}
		return true;

	}

	public Contato pesquisarContato(int posicaoContato) {
		if (posicaoContato >= 1 && posicaoContato <= 100) {
			return this.contatos[posicaoContato];

		}
		return null;

	}

	public void listaContatos() {

	}
}