import java.util.Scanner;

public class loop1Exercise {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
		  
			System.out.println("Exit? (y exits)");
		    String input = scanner.nextLine();
		    if (input.equals("y")) {
		        break;
		    }

		    System.out.println("Ok! Let's carry on!");
		}

		System.out.println("Ready!");
		
		
	}
}		
//		//loops stop after one input, if enter 'no', it kept asking question.
//		
//		Scanner reader = new Scanner(System.in);
//	
//		System.out.println("Carry on? no to stop.");
//		
//		
//		// String.valueOf(reader.nextLine)
//		String op = String.valueOf(reader.nextLine());
//	
//		// difference between op.equals("no")?
//		while(!op.contentEquals("no")) {
//		
//			
////			if(op != "no") {
////				
////
////				break;
////
////			}
//			System.out.println("Carry on? no to stop.");
//			
//			op = String.valueOf(reader.nextLine());
//
//		
//			}	
//	}

