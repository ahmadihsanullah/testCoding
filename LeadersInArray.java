import java.util.ArrayList;
import java.util.Comparator;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> leaders = leaders(arr, 6);
        System.out.println(leaders);
    }

    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> leaders = new ArrayList<>();
        
        int maxRight = arr[n - 1]; // Anggapkan elemen terakhir sebagai leader
        
        // Tambahkan elemen terakhir sebagai leader pertama
        leaders.add(maxRight);

        // Lakukan iterasi dari kanan ke kiri
        for (int i = n - 2; i >= 0; i--) {
            // Jika elemen saat ini lebih besar dari elemen terbesar di sebelah kanannya
            if (arr[i] >= maxRight) {
                System.out.println("max right before : " + maxRight);
                maxRight = arr[i]; // Update elemen terbesar di sebelah kanan
                System.out.println("max right after : " + maxRight);
                leaders.add(maxRight); // Tambahkan elemen saat ini sebagai leader
            }
        }
        leaders.sort(Comparator.reverseOrder());    
        return leaders;
    }
}
