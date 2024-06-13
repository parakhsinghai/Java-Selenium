package Interview.Programs;

import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        int vowelCount = countVowels("ParakhSinghai");
        
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
    public static int countVowels(String inputString) {
        int count = 0;
        // Convert the input string to lowercase to simplify the check
        inputString = inputString.toLowerCase();
        
        // Iterate through the string and count vowels
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
