import java.util.*;

public class Aa {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the number of elements in the array: ");
   int size = scanner.nextInt();
  int[] numbers = new int[size];
   System.out.print("Enter the elements of the array: ");
   for (int i = 0; i < size; i++) {
    numbers[i] = scanner.nextInt();
    }
   double sum = 0;
   for (int number : numbers) {
        sum += number;
     }
     double mean = sum / size;
     Map<Integer, Integer> frequencyMap = new HashMap<>();
     int maxFrequency = 0;
     int mode = 0;
     for (int number : numbers) {
      int frequency = frequencyMap.getOrDefault(number, 0) + 1;
       frequencyMap.put(number, frequency);
       if (frequency > maxFrequency) {
         maxFrequency = frequency;
          mode = number;
           }
       }
 Arrays.sort(numbers);
     double median;
      if (size % 2 == 0) {
            int middle1 = size / 2 - 1;
            int middle2 = size / 2;
            median = (numbers[middle1] + numbers[middle2]) / 2.0;
        } else {
            int middle = size / 2;
            median = numbers[middle];
        }
        System.out.println("Mean: " + mean);
    System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        scanner.close();
    }
}
