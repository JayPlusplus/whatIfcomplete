package whatifcomplete;
import java.util.Scanner;
public class Whatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		
		System.out.println("product name is <good number>");
		System.out.println("the average is  " + (num1 + num2)/2);
		if ((num1+num2) > 1000) {
			System.out.print("the sum is  " +  (num1 + num2));
			System.out.print("*");
		}
		if ((num1+num2) <= 200) {
			System.out.print("the sum is  " +  (num1 + num2));
			System.out.print("~");
		}
		if ((num1+num2) < 1000 && (num1+num2) > 200) {
			System.out.print("the sum is  " +  (num1 + num2));
			System.out.print("~");
			System.out.print("*");
			
		}
	}

}
