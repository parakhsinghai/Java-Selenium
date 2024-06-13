package Interview.Programs;

public class ReverseStringProgram {
	public static void main(String args[]) {
		String inputString = " I am Parakh Singhai";
		
		StringBuilder reverse = new StringBuilder();
		for (int i = inputString.length()-1; i>0; i--) {
			reverse.append(inputString.charAt(i));
		}
		System.out.println("Reverse String is : " +reverse);
	}

}
