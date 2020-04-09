import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input a number, 0 to quit.");
			
			//nextLine and nextInt? difference.
			//int command = reader.nextLine() difference?
			int command = Integer.valueOf(reader.nextLine());
			
			if(command == 0) {
				
				// I thought there's no 'break' should be used in the if loop?
				break;
			}
			System.out.println("Your input is: "+ command);
		}
		System.out.println("Done.");
		reader.close();
	}

}
