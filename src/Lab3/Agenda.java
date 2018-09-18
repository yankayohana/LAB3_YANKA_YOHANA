package Lab3;

import java.util.ArrayList;
import java.util.Arrays;

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
		this.contatos[posicaoContato - 1] = contato;
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

	public ArrayList<String> listaContatos() {
		ArrayList<String> listaContatos = new ArrayList<String>();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				listaContatos.add(this.contatos[i].getNomeContato() + " " + this.contatos[i].getSobrenomeContato());

			}
		}
		return listaContatos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contatos);
		return result;
	}

	public boolean equals(Object objeto) {
		if (objeto == null) {
			return false;
		}
		if (objeto instanceof Agenda) {
			Agenda agenda = (Agenda) objeto;
			for (int i = 0; i < agenda.contatos.length; i++) {
				if (agenda.contatos[i] != null) {
					if (this.contatos[i] != null) {
						if (!agenda.contatos[i].equals(this.contatos[i])) {
							return false;

						}
					} else {
						return false;
					}
				} else if (this.contatos[i] != null) {
					return false;

				}

			}
			return true;
		}
		return false;
	}
	
	
}
