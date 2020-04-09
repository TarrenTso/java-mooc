import java.util.Scanner;

public class introOfLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberRead = 0;
		int sum = 0;
		
		while (true) {
			if(numberRead == 5) {
				break;
			}
			System.out.print("Input number: ");
			sum = sum + Integer.valueOf(scanner.nextLine());
			
			numberRead = numberRead + 1;
		}
		
		
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}
	

}
