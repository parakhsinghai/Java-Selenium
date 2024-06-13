package Interview.Programs;

public class ReverseStringInGroups {

	    public static void main(String[] args) {
	        String input = "i am parakh";
	        String reversedString = reverseEachWord(input);
	        System.out.println(reversedString);
	    }

	    public static String reverseEachWord(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        // Split the string into words
	        String[] words = str.split(" ");
	        StringBuilder reversed = new StringBuilder();

	        // Reverse each word and append to the result
	        for (String word : words) {
	            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
	        }

	        // Trim the trailing space and return the result
	        return reversed.toString().trim();
	    }
	}

