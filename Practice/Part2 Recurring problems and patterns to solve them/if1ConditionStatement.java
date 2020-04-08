import java.util.Scanner;

public class if1ConditionStatement {

	public static void main(String[] args) {

		Scanner reader = new Scanner (System.in);
		
		System.out.print("Enter 1st: ");
		
		int first = Integer.valueOf(reader.nextInt());
		
		System.out.print("Enter 2nd: ");
		int second = Integer.valueOf(reader.nextInt());
		
		int sum = first + second;
		
		if(sum > 100) {
			System.out.println("TOO MUCH!");
		}
		else if(sum < 0) {
			System.out.println("TOO LITTLE!");
		}
		else {
			System.out.println("Valid value");
		}
		reader.close();
		
		
	}

}
