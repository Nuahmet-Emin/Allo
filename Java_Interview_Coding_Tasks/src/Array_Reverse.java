import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */
    public static void main(String[] args){
        int[] nums = {1,2,4,110,-11,-11};
        System.out.println (Arrays.toString( reverseArray(nums)));
        System.out.println (Arrays.toString( reverseArray2(nums)));
    }


    public static int[] reverseArray(int[] arr){
        int [] result = new int[arr.length];

        for(int i= arr.length-1, j=0; i>=0; i--,j++){
            result[j]= arr[i];
        }

        return result;
    }

    public static int[] reverseArray2(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
