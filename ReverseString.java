package Interview.Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Parakh";
        
        StringBuilder reversed = new StringBuilder();
     // Iterate through the string in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        
        System.out.println("Reversed string: " + reversed);
    }
 }

