package Interview.Programs;

public class ReverseNumberProgram {
	public static void main(String args[]) {
		int inputNumber = 123456789;
		
		StringBuilder reverse = new StringBuilder();
		
		while(inputNumber>0) {
		reverse.append(inputNumber%10);
		inputNumber=inputNumber/10;
	}
	System.out.println("Reverse Number is : " + reverse);
}
}
