package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab3.Agenda;

class AgendaTest {

	private Agenda agenda = new Agenda();

	@Test
	public void testContatoPosicaoVazia() {

		assertTrue(this.agenda.cadastraContato("matheus", "sobrenome", "(83) 99999-0000", 1));
		System.out.println(this.agenda.getToStringContato(1));
		assertTrue(this.agenda.getToStringContato(1).equals("matheus sobrenome - (83) 99999-0000"));

	}

	@Test
	public void testContatoEmPosicaoExistente() {
		this.agenda.cadastraContato("pedro", "sobrenome", "(84) 98888-11111", 1);
		assertTrue(this.agenda.getToStringContato(1).equals("pedro sobrenome - (84) 98888-11111"));
	}

	@Test

	public void testContatoEmPosicaoInvalida() {
		this.agenda.cadastraContato("yanks", "sobrenome", "(83) 99999-9999", 0);
		assertTrue(this.agenda.getToStringContato(0).equals("POSIÇÃO INVÁLIDA!"));
	}

	@Test

	public void testContatoEmPosicaoInvalida2() {
		this.agenda.cadastraContato("yanks", "sobrenome", "(83) 99999-9999", 101);
		assertTrue(this.agenda.getToStringContato(101).equals("POSIÇÃO INVÁLIDA!"));
	}

	@Test

	public void testContatoEmPosicaoLimite() {
		this.agenda.cadastraContato("Maria", "sobrenome", "+1 (595) 5555-123", 100);
		assertTrue(this.agenda.getToStringContato(100).equals("Maria sobrenome - +1 (595) 5555-123"));
	}
	
	
	
}
