import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		// what's the 'true' condition for?
		while(true) {
			
			System.out.println("Exit? y= exit");
			
			String input = reader.nextLine();
			
			if(input.contentEquals("y")) {
				break;
			}
			
			System.out.println("Carry on!");
		}
		System.out.println("Ready!");
	}

}
