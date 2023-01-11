import java.util.Scanner;

public class Mod10_v1 {

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

		for (int i = chave.length() - 1; i >= 0; i--) {
			int d = Integer.valueOf(chave.substring(i, i + 1));
			int pond = d * mult;
			soma += pond;

			mult = mult == 3 ? 1 : 3;
		}

		digito = 10 - (soma % 10);
		if (digito == 10)
			digito = 0;

		return String.valueOf(digito);
	}
}
