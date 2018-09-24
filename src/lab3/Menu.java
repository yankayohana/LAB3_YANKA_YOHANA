package lab3;

import java.util.ArrayList;

/**
 * Essa classe representa um menu que interage com o usuário.
 * 
 * @author yanka yohana - laboratório de programação 2;
 *
 */
public class Menu {

	public static void main(String[] args) {
		Input input = new Input();
		String entrada;
		Agenda agenda = new Agenda();
		do {

			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air");
			System.out.println("");
			entrada = input.leString("Opção> ");

			if (entrada.equalsIgnoreCase("C")) {
				int posicao = input.leInteiro("Posição: ");
				String nome = input.leString("Nome: ");
				String sobrenome = input.leString("Sobrenome: ");
				String telefone = input.leString("Telefone: ");
				try {
					agenda.cadastraContato(nome, sobrenome, telefone, posicao);
					System.out.println("CADASTRO REALIZADO!");
					System.out.println("");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} else if (entrada.equalsIgnoreCase("L")) {
				ArrayList<String> contatos = agenda.listaContatos();
				for (int i = 0; i < contatos.size(); i++) {
					System.out.println(contatos.get(i));
				}
			} else if (entrada.equalsIgnoreCase("E")) {
				int posicao = input.leInteiro("Contato> ");
				System.out.println("");
				try {
					System.out.println(agenda.getToStringContato(posicao));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("");
			}
		} while (!entrada.equalsIgnoreCase("S"));
	}
}
