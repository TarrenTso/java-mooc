import java.util.Scanner;

public class intro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.print("Enter a number: ");
		
		sum = sum + Integer.valueOf(scanner.nextInt());
		
		System.out.print(sum);

		scanner.close();
		
		
	}

}
