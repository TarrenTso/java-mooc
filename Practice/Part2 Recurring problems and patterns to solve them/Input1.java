import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

        // Identifying the input values and declaring the variables for them
        int first = 6;
        int second = 5;
        

        // Assigning the user input to the variables
        System.out.print("Enter firt:");
        
        first = Integer.valueOf(reader.nextLine());
        
        System.out.print("Enter second:");

        second = Integer.valueOf(reader.nextLine());
        // Identifying the operation and declaring a variable for the result
        int product = first * second;

        // Printing the result of the operation
        System.out.println("The product of " + first + " and " + second + " is " + product);

	}

}
