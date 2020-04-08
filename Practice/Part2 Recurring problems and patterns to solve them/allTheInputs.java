import java.util.Scanner;

public class allTheInputs {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		String text = reader.nextLine();
		
		int number = Integer.valueOf(reader.nextLine());
		
		double numberWithDecimal = Double.valueOf(reader.nextLine());
		
		boolean trueOrFalse = Boolean.valueOf(reader.nextLine());
	}

}
