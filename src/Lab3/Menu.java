package Lab3;

import java.util.Scanner;

/**
 * Essa classe representa um menu que interage com o usuário.
 * 
 * @author yanka yohana - laboratório de programação 2;
 *
 */
public class Menu {

	public static void main(String[] args) {
		String entrada;
		Agenda agenda = new Agenda();
		do {

			System.out.println("(C)adastrar Contato");
			System.out.println("(L)istar Contatos");
			System.out.println("(E)xibir Contato");
			System.out.println("(S)air");

			Scanner sc = new Scanner(System.in);
			entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("C")) {
				String nome = sc.nextLine();
				String sobrenome = sc.nextLine();
				String telefone = sc.nextLine();
				int posicao = sc.nextInt();
				agenda.cadastraContato(nome, sobrenome, telefone, posicao);

				System.out.println("Opção> " + entrada);
				sc.nextLine();

				System.out.println("Posição: " + posicao);
				System.out.println("Nome: " + nome);
				System.out.println("Sobrenome: " + sobrenome);
				System.out.println("Telefone: " + telefone);
				System.out.println("CADASTRO REALIZADO!");

			} else if (entrada.equalsIgnoreCase("L")) {
				System.out.println(agenda.listaContatos());
			} else if (entrada.equalsIgnoreCase("E")) {
				int posicao = sc.nextInt();
				System.out.println();
			}
		} while (!entrada.equalsIgnoreCase("S"));
	}
}
