package Interview.Programs;

public class SecondHighestValue {
	
    public static void main(String[] args) {
    	
        int[] array = {12, 1, 10, 34,34,60, 1};
        
        int secondHighest = findSecondHighest(array);
        
        if(secondHighest !=Integer .MIN_VALUE) {
            System.out.println("The second highest value is: " + secondHighest);
        } else {
            System.out.println("The array does not have a second highest value.");
        }
    }
    
    public static int findSecondHighest(int[] array) {
        if(array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for(int value : array) {
            if(value > highest) {
                secondHighest = highest;
                highest = value;
            } else if(value > secondHighest && value < highest) {
                secondHighest = value;
            }
        }
        
        if(secondHighest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second highest value found in the array.");
        }
        
        return secondHighest;
    }
}
