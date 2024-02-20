import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class FindDuplicatInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,23};
        ArrayList<Integer> hasil = duplicates(arr, 3);
        System.out.println(hasil);
    }

     public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        /**
        Given an array a of size N which contains elements from 0 to N-1,
        you need to find all the elements occurring more than once in the given array.
        Return the answer in ascending order.
        If no such element is found, return list containing [-1]. 
         **/

         HashSet<Integer> temp = new HashSet<>();
         HashSet<Integer> duplicates = new HashSet<>();

         for (Integer nilai : arr) {
            //selagi temp tidak bisa menambah data nilai
            //karena sudah duplikat, kita pindahin ke hashhet yang lain
            if(!temp.add(nilai)){
                duplicates.add(nilai);
            }
        }

        ArrayList<Integer> result = new ArrayList<>(duplicates);
        result.sort(null);

        if(result.isEmpty()){
            result.add(-1);
        }

        return result;

    }
}
