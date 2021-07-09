import java.util.Arrays;

public class Array_SortDescendingOrder {


    public static void main(String[] args){
        int[] nums = {2,1,4,110,-11,-11};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortDescending(nums) ));

    }

    public static int[] sortDescending(int[] arr){

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if(arr[i] >arr[j]){
                    temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
