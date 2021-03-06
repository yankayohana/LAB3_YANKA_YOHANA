package lab3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Essa classe representa a agenda.
 * @author yanka yohana
 *
 */
public class Agenda {
	
	/**
	 * Um array chamado contatos do tipo Contato.
	 */
	private Contato[] contatos;

	/** 
	 * Constrói uma agenda com 100 contatos "vazios".
	 */
	public Agenda() {
		this.contatos = new Contato[100];
	}

	/**
	 * Cadastra um novo contato na agenda.
	 * @param nomeContato uma string que representa o nome do contato.
	 * @param sobrenomeContato uma string que representa o sobrenome do contato.
	 * @param telefoneContato uma string que representa o telefone do contato.
	 * @param posicaoContato um inteiro que representa a posição do contato.
	 * @return false se eu o contato não for válido e true se for for válido e o cadastro é realizado.
	 * @throws Exception 
	 */
	public boolean cadastraContato(String nomeContato, String sobrenomeContato, String telefoneContato,
			int posicaoContato) throws Exception {
		Contato contato = new Contato(nomeContato, sobrenomeContato, telefoneContato, posicaoContato);
		this.contatos[posicaoContato - 1] = contato;
		return true;

	}

	/**
	 * Pesquisa um contato na agenda.
	 * @param posicaoContato um inteiro que representa a posição do contato na agenda.
	 * @return retorna contato ou null se não encontrar.
	 * @throws Exception 
	 */
	public Contato pesquisarContato(int posicaoContato) throws Exception {
		Validator.verificaIndice(posicaoContato);
		Contato contato =  this.contatos[posicaoContato];
		if (contato == null) {
			throw new Exception("POSIÇÃO INVÁLIDA!");
		}
		return contato;

	}
	
	/**
	 * Retorna um string do contato na posição no formato "posição - nome sobrenome".
	 * @param posicao inteiro que representa a posição do contato na agenda.
	 * @return retorna uma string com o contato ou a string "POSIÇÃO INVÁLIDA!" se a posição for inválida.
	 * @throws Exception 
	 */
	public String getToStringContato(int posicao) throws Exception {
		Contato contato = pesquisarContato(posicao - 1);
		return contato.toString();
	}

	/**
	 * Lista os contatos da agenda no formado "posição - nome sobrenome".
	 */
	public ArrayList<String> listaContatos() {
		ArrayList<String> listaContatos = new ArrayList<String>();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				listaContatos.add(this.contatos[i].getPosicaoContato() + " - " + this.contatos[i].getNomeContato() + " "
						+ this.contatos[i].getSobrenomeContato());

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

	/**
	 * Verifica se agenda tem os mesmos contatos nas mesmas posiçoes.
	 */
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
