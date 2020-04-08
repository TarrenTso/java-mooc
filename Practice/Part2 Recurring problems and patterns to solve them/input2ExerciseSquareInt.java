import java.util.Scanner;

public class input2ExerciseSquareInt {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Please enter an integer: ");
		
		int input = Integer.valueOf(reader.nextInt());
		
		int value = input * input;
		
		System.out.println("The square of the given integer is: " + value);
		
		reader.close();

	}

}
