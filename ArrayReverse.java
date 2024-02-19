import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] data = {
                1,2,3,2,1,2
        };
        System.out.println("Sebelum di reverse");
        System.out.println(Arrays.toString(data));
        System.out.println("Setelah di reverse");
        System.out.println(Arrays.toString(reverseArrayInt(data)));

        String[] stringArr = {
                "hanif", "isan", "rehan"
        };

        System.out.println(Arrays.toString(reverseArrayString(stringArr)));
    }

    static int[] reverseArrayInt(int[] data){
        for(var i = 0; i < data.length/2 ; i++){
            int temp = data[i];
            data[i] = data[data.length - i -1];
            data[data.length - i -1 ] = temp;
        }
        return data;
    }

    static String[] reverseArrayString(String[] data){
        for(var i = 0; i < data.length/2 ; i++){
            String temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i -1] = temp;
        }
        return data;
    }
}
