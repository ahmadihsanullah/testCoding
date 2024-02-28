import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 23};
        ArrayList<Integer> hasil = duplicates(arr, 5);
        System.out.println(hasil);
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Menghitung frekuensi setiap elemen dalam array
        for (int nilai : arr) {
            frequencyMap.put(nilai, frequencyMap.getOrDefault(nilai, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        frequencyMap.forEach((k,v) ->{
            System.out.println(k + " : " + v);
        });
        // Memeriksa apakah ada elemen yang memiliki frekuensi lebih dari satu
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                result.add(key);
            }
        }

        // Jika tidak ada elemen duplikat, tambahkan -1 ke hasil
        if (result.isEmpty()) {
            result.add(-1);
        } else {
            // Mengurutkan hasil dalam urutan menaik
            result.sort(null);
        }

        return result;
    }
}
