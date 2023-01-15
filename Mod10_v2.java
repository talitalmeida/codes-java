
import java.util.Scanner;

public class Mod10_v2 {

	// Modulo 10, length

	public static void main(String[] args) {
		
		try (Scanner leitura = new Scanner(System.in)) {
			String chave = leitura.next();
			String digitoVerificador = mod10(chave);
			System.out.println(digitoVerificador);
		}

	}

	private static String mod10(String chave) {
		int digito = 0;
		int soma = 0;
		int mult = 3;
		boolean testador = false;

		for (int i = 0; i < chave.length(); i++) {
			int d = Integer.valueOf(chave.substring(i, i + 1));

			if (d > 0) {
				testador = true;
			}
			if (testador) {
				int pond = d * mult;
				soma += pond;

				mult = 4 - mult;
			}
		}

		digito = 10 - (soma % 10);
		if (digito == 10)
			digito = 0;

		return String.valueOf(digito);
	}

}
