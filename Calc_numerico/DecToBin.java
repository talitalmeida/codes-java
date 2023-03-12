import java.util.Scanner;
public class DecToBin{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
			int numDecimal = read.nextInt();
			int numBinary = convertDecToBin(numDecimal);
			
			System.out.println(numBinary);
	}
	
	private static int convertDecToBin(int decimal) {
		String resto = "";
		for(int i = decimal; i > 0 ; i = i/2) {
			resto += String.valueOf(decimal%2);
			decimal /= 2;
		}
		
		String num_binary = new StringBuilder(resto).reverse().toString();
		
		return Integer.valueOf(num_binary);
	}	

} 