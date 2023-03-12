import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String numBinary = read.next();
		int numDecimal = convertBinToDec(numBinary);

		System.out.println(numDecimal);
	}

	private static int convertBinToDec(String bin) {
		int decimal = 0;

		for (int i = 0; i < bin.length(); i++) {
			int d = Integer.valueOf(bin.substring(bin.length() - i - 1, bin.length() - i));

			if (d != 0) {
				decimal += (int) Math.pow(2, i);
			}
		}
		return decimal;
	}
}