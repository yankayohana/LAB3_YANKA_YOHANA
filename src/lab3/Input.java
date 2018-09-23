package lab3;

import java.util.Scanner;

/**
 * Essa classe encapsula a entrada de dados da entrada.
 * 
 * @author yanks
 *
 */

public class Input {
	private Scanner sc;

	public Input() {
		this.sc = new Scanner(System.in);
	}

	public String leString() {

		String retorno = this.sc.nextLine();

		return retorno;
	}

	public String leString(String mensagem) {
		System.out.print(mensagem);
		return leString();
	}

	public int leInteiro() {

		int retorno = this.sc.nextInt();
		this.sc.nextLine();

		return retorno;
	}

	public int leInteiro(String mensagem) {
		System.out.print(mensagem);
		return leInteiro();
	}

}
