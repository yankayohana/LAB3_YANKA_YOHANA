package lab3;

/**
 * Essa classe representa um contato.
 * 
 * @author yanka yohana, laboratória de programação 2;
 *
 */
public class Contato {
	
	/**
	 * String que representa o nome do contato.
	 */
	private String nomeContato;
	
	/**
	 * String que representa o sobronome do contato.
	 */
	private String sobrenomeContato;
	
	/**
	 * String que representa o telefone do contato.
	 */
	private String telefoneContato;
	
	/**
	 * inteiro que representa a posição do contato.
	 */
	private int posicaoContato;
	
	/**
	 * Constrói um contato a partir do nome, sobrenome, telefone e posição do contato. 
	 * @param nomeContato uma string que representa o nome do contato.
	 * @param sobrenomeContato uma string que representa o sobrenome do contato.
	 * @param telefoneContato uma string que representa que representa o telefone do contato.
	 * @param posicaoContato um inteiro que representa a posição do contato.
	 * @throws Exception 
	 */
	public Contato(String nomeContato, String sobrenomeContato, String telefoneContato, int posicaoContato) throws Exception {
		Validator.verificaString(nomeContato, "NOME");
		Validator.verificaString(sobrenomeContato, "SOBRENOME");
		Validator.verificaString(telefoneContato, "TELEFONE");
		Validator.verificaPosicao(posicaoContato);
		
		this.nomeContato = nomeContato;
		this.sobrenomeContato = sobrenomeContato;
		this.telefoneContato = telefoneContato;
		this.posicaoContato = posicaoContato;
	}

	
	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;

	}

	public String getSobrenomeContato() {
		return sobrenomeContato;
	}

	public void setSobrenomeContato(String sobrenomeContato) {
		this.sobrenomeContato = sobrenomeContato;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public int getPosicaoContato() {
		return posicaoContato;
	}

	public void setPosicaoContato(int posicaoContato) {
		this.posicaoContato = posicaoContato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeContato == null) ? 0 : nomeContato.hashCode());
		return result;
	}

	/**
	 * Verifica se dois contatos são iguais.
	 */
	public boolean equals(Object objeto) {
		if (objeto == null) {
			return false;
		}
		if (objeto instanceof Contato) {
			Contato contato = (Contato) objeto;
			return contato.getNomeContato().equals(this.getNomeContato());
		}
		return false;
	}

	/**
	 * Retorna uma string que representa um contato.
	 */
	public String toString() {
		return this.nomeContato + " " + this.sobrenomeContato + " " + "-" + " " + this.telefoneContato;
	}
}
