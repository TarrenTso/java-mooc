import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		String input = reader.nextLine();

		
		// what's the 'true' condition for?
		while(!input.contentEquals("y")) {
			
			System.out.println("Exit? y= exit");
			
			// String input = String.valueOf(reader.nextLine())
			//difference
			
			
			 input = reader.nextLine();
			
//			if(input.contentEquals("y")) {
//				break;
//			}
			
			System.out.println("Carry on!");
		}
		System.out.println("Ready!");
		reader.close();
	}

}
