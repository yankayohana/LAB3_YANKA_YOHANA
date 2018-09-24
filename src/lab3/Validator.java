package lab3;

public class Validator {

	public static void verificaString(String string, String atributo) throws Exception {
		if (string == null || string.equals("")) {
			throw new Exception(atributo + " INVÁLIDO!");
		}
	}

	public static void verificaPosicao(int posicao) throws Exception {
		if (posicao < 1 || posicao > 100) {
			throw new Exception("POSIÇÃO INVÁLIDA!");
		}
	}

	public static void verificaIndice(int indice) throws Exception {
		if (indice < 0 || indice > 99) {
			throw new Exception();

		}
	}

}
