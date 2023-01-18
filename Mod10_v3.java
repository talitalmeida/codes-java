import java.util.Scanner;

public class Mod10_v3 {

	public static void main(String[] args) {
		try (Scanner leitura = new Scanner(System.in)) {
			String chave = leitura.next().replaceAll("//D", "");
			String digitoVerificador = mod10(chave);
			System.out.println(digitoVerificador);
		}

	}

	private static String mod10(String chave) {
		int digito = 0;
		int soma = 0;
		int mult = 4;

		for (int i = 0; i <= chave.length() - 1; i++) {
			int d = Integer.valueOf(chave.substring(i, i + 1));
			int pond = d * mult;
			soma += pond;

			mult = i % 2 == 0 ? 9 : 4;
		}

		digito = 10 - (soma % 10);

		return String.valueOf(digito);
	}

}