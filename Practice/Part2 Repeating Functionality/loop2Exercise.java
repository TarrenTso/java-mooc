import java.util.Scanner;

public class loop2Exercise {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		while(true) {
		System.out.println("Give a number. 4 to stop.");
		int num = Integer.valueOf(reader.nextInt());
		
		if(num == 4) {
			break;
		}
		System.out.println("Your input " + num);
		}
		
		System.out.println("Done.");
		
		reader.close();

		
	}

}
