import java.util.Arrays;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double mean = (double) sum / array.length;
        
        
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            int mid1 = array[array.length / 2 - 1];
            int mid2 = array[array.length / 2];
            median = (double) (mid1 + mid2) / 2;
        } else {
            median = (double) array[array.length / 2];
        }
        
        
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}
