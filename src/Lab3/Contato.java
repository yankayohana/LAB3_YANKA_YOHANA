package Lab3;

/**
 * Essa classe representa um contato.
 * 
 * @author yanka yohana, laboratória de programação 2;
 *
 */
public class Contato {
	private String nomeContato;
	private String sobrenomeContato;
	private String telefoneContato;
	private int posicaoContato;

	public Contato(String nomeContato, String sobrenomeContato, String telefoneContato, int posicaoContato) {
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
	
	public String toString() {
		return this.nomeContato + " " + this.sobrenomeContato + " " + "-" + " " + this.telefoneContato; 
	}
}
