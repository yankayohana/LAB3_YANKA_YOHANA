package lab3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import lab3.Agenda;

class AgendaTest {

	private Agenda agenda = new Agenda();

	@Test
	public void testContatoPosicaoVazia() throws Exception {

		assertTrue(this.agenda.cadastraContato("matheus", "sobrenome", "(83) 99999-0000", 1));
		assertTrue(this.agenda.getToStringContato(1).equals("matheus sobrenome - (83) 99999-0000"));

	}

	@Test
	public void testContatoEmPosicaoExistente() throws Exception {
		this.agenda.cadastraContato("pedro", "sobrenome", "(84) 98888-11111", 1);
		assertTrue(this.agenda.getToStringContato(1).equals("pedro sobrenome - (84) 98888-11111"));
	}

	@Test

	public void testContatoEmPosicaoInvalida() throws Exception {
		assertThrows(Exception.class,() -> this.agenda.cadastraContato("yanks", "sobrenome", "(83) 99999-9999", 0));
	}

	@Test

	public void testContatoEmPosicaoInvalida2() throws Exception {
		assertThrows(Exception.class, () -> this.agenda.cadastraContato("yanks", "sobrenome", "(83) 99999-9999", 101));
	
	}

	@Test

	public void testContatoEmPosicaoLimite() throws Exception {
		this.agenda.cadastraContato("Maria", "sobrenome", "+1 (595) 5555-123", 100);
		assertTrue(this.agenda.getToStringContato(100).equals("Maria sobrenome - +1 (595) 5555-123"));
	}

	@Test

	public void testPesquisaContatoEmPosicaoValida() throws Exception  {
		this.agenda.cadastraContato("yanka", "sobrenome", "(83) 99999-0011", 1);
		Contato contato = this.agenda.pesquisarContato(0);
		assertTrue(contato.toString().equals("yanka sobrenome - (83) 99999-0011"));

	}

	@Test

	public void testPesquisaContatoEmPosicaoLimite() throws Exception {
		this.agenda.cadastraContato("livia", "sobrenome", "(83) 11111-1111", 100);
		Contato contato = this.agenda.pesquisarContato(99);
		assertTrue(contato.toString().equals("livia sobrenome - (83) 11111-1111"));

	}

	@Test

	public void testListaContatos() throws Exception {
		this.agenda.cadastraContato("yanka", "yohana", "(83)22222-2222", 1);
		this.agenda.cadastraContato("raquel", "sobrenome", "(83) 88888-8888", 2);
		ArrayList<String> lista = this.agenda.listaContatos();
		assertTrue(lista.get(0).equals("1 - yanka yohana"));
		assertTrue(lista.get(1).equals("2 - raquel sobrenome"));

	}

}
