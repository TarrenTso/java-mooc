import java.util.Scanner;

public class if3ExCompareNum {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Plz enter 1st integer: ");
		int first = Integer.valueOf(reader.nextInt());
		
		System.out.print("Plz enter 2nd integer: ");
		int second = Integer.valueOf(reader.nextInt());
		
		if(first > second) {
			System.out.println(first +" is greater than "+ second);			
		}
		else if(first < second) {
			System.out.println(first +" is smaller than "+ second);
		}
		else {
			System.out.println(first +" is equal to "+ second);
		}
		reader.close();
	}
	

}
