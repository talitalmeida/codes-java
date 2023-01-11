
public class Mod11_v2 {

	public static void main(String[] args) {

		System.out.println("Teste2: CPF");
		String cpf = "049293522";
		String dv2 = digito_modulo11(cpf, 2, 12, true, '0');
		System.out.println(cpf + "-" + dv2);
		System.out.println();
	}

	private static String digito_modulo11(String s, int numDig, int limite, boolean x10, char c10) {
		int digito = somaProduto(s, limite, x10);
		String digitoVerificador = String.valueOf(digito);

		if (numDig == 1 && digito == 10) {
			digitoVerificador = String.valueOf(c10);
		} else if (numDig == 2) {
			digitoVerificador = digitoVerificador + somaProduto(s + digitoVerificador, limite, x10);
		}

		return digitoVerificador;
	}

	private static int somaProduto(String s, int limite, boolean x10) {
		int soma_produto = 0;
		int multiplicador = 2;
		int resto = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			String caracter = s.substring(i, i + 1);
			int digito_produto = Integer.valueOf(caracter) * multiplicador;
			soma_produto += (digito_produto);
			multiplicador = (multiplicador == limite) ? 2 : multiplicador + 1;
		}
		if (x10) {
			resto = ((soma_produto * 10) % 11) % 10;
		} else {
			resto = soma_produto % 11;
		}

		return resto;
	}

}
