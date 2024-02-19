import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * MissingNumberInArray
 */
public class MissingNumberInArray {
     public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        System.out.println(missingNumber(arr, 6));
     }

     static int missingNumber(int[] arr, int n){
        int totalSum = (n * (n + 1)) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
     }
}