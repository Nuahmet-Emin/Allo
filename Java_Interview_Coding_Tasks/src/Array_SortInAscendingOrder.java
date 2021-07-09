import java.util.Arrays;

public class Array_SortInAscendingOrder {

     /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
     public static void main(String[] args){
         int[] nums = {2,1,4,110,-11,-11};

         System.out.println(Arrays.toString(nums));
         System.out.println(Arrays.toString(sortAscending(nums) ));

     }

public static int[] sortAscending(int[] arr){

         int temp =0;
//         {2,1,4,110,-11,-11
    for (int i = 0; i < arr.length; i++) {

//         {2,1,4,110,-11,-11

        for (int j = 0; j <arr.length ; j++) {

            if(arr[i] < arr[j]){
                temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }


    return arr;
}

    public static int[] sortAscending2(int[] arr){

        Arrays.sort(arr);

        return arr;
    }


}
