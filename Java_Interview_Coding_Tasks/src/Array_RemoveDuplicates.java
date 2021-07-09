import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */

    public static void main(String[] args){

        int[] nums = {1,2,4,110,-11,-11};
        System.out.println("Arrays.toString(removeDuplicated(nums)) = " + Arrays.toString(removeDuplicated(nums)));

        Array_RemoveDuplicates removeDuplicates = new Array_RemoveDuplicates();
        System.out.println( Arrays.toString(removeDuplicates.removeDuplicates2(nums)) );
    }

    public static int[] removeDuplicated(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            if(!list.contains(each)){
                list.add(each);
            }
        }

        int[] result = new int[list.size()];

        for(int i=0; i<=list.size()-1;i++){
            result[i] = list.get(i);
        }

        return  result;
    }

    public int[] removeDuplicates2(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
}
