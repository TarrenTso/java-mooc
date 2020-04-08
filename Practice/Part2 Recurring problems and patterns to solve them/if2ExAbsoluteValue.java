import java.util.Scanner;

public class if2ExAbsoluteValue {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int value = Integer.valueOf(reader.nextInt());
		
		if(value < 0) {
			System.out.println(value * -1);
		}
		else {
			System.out.print(value);

		}
		reader.close();
		
	}

}
