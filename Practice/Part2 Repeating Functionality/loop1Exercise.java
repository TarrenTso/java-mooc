import java.util.Scanner;

public class loop1Exercise {

	public static void main(String[] args) {
		
		//loops stop after one input, if enter 'no', it kept asking question.
		
		Scanner reader = new Scanner(System.in);
	
		System.out.println("Carry on? no to stop.");
		String op = reader.nextLine();
	
		// difference between op.equals("no")?
		while(op == "no") {
		
		break;
		
	}	if(op != "no") {
		System.out.println("Carry on? no to stop.");
	}
	}}
