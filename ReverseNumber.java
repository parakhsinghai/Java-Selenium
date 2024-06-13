package Interview.Programs;

import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[]) {
		int inputNumber = 12345678;
		
		StringBuilder reverse = new StringBuilder();
		while(inputNumber>0) {
			reverse.append(inputNumber%10);
		inputNumber=inputNumber/10;	
		}
	System.out.println("ReverseNumber: " +reverse);
	}
}


