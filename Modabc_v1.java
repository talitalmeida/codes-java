import java.util.Scanner;

public class Modabc_v1 {

	static String list_code[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "-", "$", ":", "/", ".", "+", "A",
			"B", "C", "D" };

	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			String code = read.next();
			String code_key = mod_abc(code);

			System.out.print((code.substring(0, code.length() - 1)) + code_key + (code.substring(code.length() - 1)));
		}

	}

	private static String mod_abc(String code) {
		int soma = 0;
		String resto = "";

		for (int i = 0; i < code.length(); i++) {
			String d = code.substring(i, i + 1);
			soma += getIndex(d);
		}

		resto = getValue(16 - (soma % 16));

		return String.valueOf(resto);
	}

	static int getIndex(String item) {
		int refer = 0;

		for (int i = 0; i < 43; i++) {
			if (item.equals(list_code[i])) {
				refer = i;
				return refer;
			}
		}

		return refer;
	}

	static String getValue(int item) { // resto

		return list_code[item];
	}

}