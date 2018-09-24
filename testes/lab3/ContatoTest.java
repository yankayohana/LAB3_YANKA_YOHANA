package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContatoTest {

	@Test
	void testConstrutorValido() throws Exception {
		Contato contato = new Contato("yanka", "yohana", "(83) 99999-9999", 1);
	}
	
	@Test
	void testConstrutorInvalido()  {
		assertThrows(Exception.class, () -> new Contato("", "yohana", "(83) 99999-9999", 1));
		assertThrows(Exception.class, () -> new Contato(null, "yohana", "(83) 99999-9999", 1));
		assertThrows(Exception.class, () -> new Contato("yanka", "", "(83) 99999-9999", 1));
		assertThrows(Exception.class, () -> new Contato("yanka", null, "(83) 99999-9999", 1));
		assertThrows(Exception.class, () -> new Contato("yanka", "yohana", "", 1));
		assertThrows(Exception.class, () -> new Contato("yanka", "yohana", null, 1));
		assertThrows(Exception.class, () -> new Contato("yanka", "yohana", "(83) 99999-9999", 0));
		assertThrows(Exception.class, () -> new Contato("yanka", "yohana", "(83) 99999-9999", 101));
	}
	
}
