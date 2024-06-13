package Interview.Programs;

public class SwapTwoNumbers {
	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 20;
		
		System.out.println("Before Swapping number is");
		System.out.println("a" + num1);
		System.out.println("b" +num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping number is");
		System.out.println("a" + num1);
		System.out.println("b" +num2);
		
		}

}
