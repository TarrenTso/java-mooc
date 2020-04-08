import java.util.Scanner;

public class input3ExerSquareRootSum {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter integer one: ");
		
		int num1 = Integer.valueOf(reader.nextInt());
		
		System.out.print("Please enter integer two: ");
		
		int num2=  Integer.valueOf(reader.nextInt());
		
		int sum = num1 + num2;
		
		double squareRoot = Math.sqrt(sum);
		
		System.out.print(squareRoot);
		
		reader.close();
		
		
	}

}
