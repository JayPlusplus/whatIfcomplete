package whatifcomplete;
import java.util.Scanner;

public class WhatIf {
	public static void main(String[] args) {
		
		String ID, Name,code;
		double Amount;
		double totalAmount = 0;
		String taxCode = " ";
		double NRM = 0.06;
		double NPF = 0;
		double BIZ = 0.045;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Customer ID:");
		ID = keyboard.next();
		System.out.println("Customer Name:");
		Name = keyboard.next();
		System.out.println("Sales Amount:");
		Amount = keyboard.nextDouble();
		System.out.println("Tax Code:");
		code = keyboard.next();
		if (code.equals("NRM")){
			totalAmount = Amount * 1.06;
			
		}
		if (code.equals("NPF")){
			totalAmount = Amount * 1;
		
		}
		if (code.equals("BIZ")){
			totalAmount = Amount * 1.045;
		
		}
		System.out.println("<Customer Receipt>");
		System.out.println();
		System.out.println("Customer ID:" + ID);
		System.out.println("Customer Name:" + Name);
		System.out.println("Sales Amount:" + Amount);
		System.out.println("Tax Code:" + code);
		System.out.println("Total Amount Due: " + totalAmount);
}
}