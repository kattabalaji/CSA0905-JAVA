import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] array = {14, 67, 48, 5, 62, 23};
        int n = 4; // Change this value to find the Nth largest number
        
        Arrays.sort(array);
        
        if (n <= array.length) {
            int nthLargest = array[array.length - n];
            System.out.println(n + "th Largest number: " + nthLargest);
        } else {
            System.out.println("N is out of range for the array.");
        }
    }
}
