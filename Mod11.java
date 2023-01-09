
public class Mod11 {

	public static void main(String[] args) {

		// teste para conta do Banco do brasil
		System.out.println("Teste1: Conta do Banco do Brasil");
		String conta = "35278";
		String dv1 = digito_modulo11(conta, 1, 12, true, 'X');
		System.out.println(conta + "-" + dv1);
		System.out.println();

		System.out.println("Teste2: CPF");
		String cpf = "327635132";
		String dv2 = digito_modulo11(cpf, 2, 12, true, '0');
		System.out.println(cpf + "-" + dv2);
		System.out.println();

		System.out.println("Teste3: CNPJ");
		String cnpj = "111183930001";
		String dv3 = digito_modulo11(cnpj, 2, 9, true, '0');
		System.out.println(cnpj + "-" + dv3);
		System.out.println();

		System.out.println("Teste4: RG de São Paulo");
		String rg = "45543700";
		String dv4 = digito_modulo11(rg, 1, 9, false, 'X');
		System.out.println(rg + "-" + dv4);
	}

	private static String digito_modulo11(String s, int numDig, int limite, boolean x10, char c10) {
		String dv = "";
		if (numDig > 1)
			c10 = '0';

		for (int x = 0; x < numDig; x++) {
			int mult = 2;
			int soma = 0;

			String t = s + dv;

			for (int i = t.length() - 1; i >= 0; i--) {
				int d = Integer.valueOf(t.substring(i, i + 1));
				int p = d * mult;
				soma += p;

				mult++;
				if (mult > limite)
					mult = 2;
			}

			if (x10)soma *= 10;
			int resto = soma % 11;
			dv = (resto == 10) ? String.valueOf(c10) : String.valueOf(resto);
		}

		return dv;
	}

}