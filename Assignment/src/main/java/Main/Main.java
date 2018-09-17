package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Take input from keyboard and display output
		 */
		Scanner kb = new Scanner(System.in);
		 System.out.print("Amount: ");
		 String amount = kb.nextLine();
		 System.out.print("Promo Code: ");
		 String pCode = kb.nextLine();
		 kb.close();
		 
		 Calculator calc = new Calculator();
		 System.out.println("Discount: " + calc.discValue(pCode));
		 System.out.println("Amount yang Harus dibayar: " + calc.newAmount(amount, pCode));
		 
	}

}
