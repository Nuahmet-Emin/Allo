import java.util.Arrays;

public class Array_MergeTwoArrays {
     /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args){
        int[] arr1 = {1,2,4,110,};
        int[] arr2 = {2,82,4,33};

        System.out.println(Arrays.toString(mergeTwoArrays(arr1, arr2)));

    }

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){

        int[] resultArray = new int[arr1.length + arr2.length];

        int i =0;

        for (int each : arr1) {
            resultArray[i] = each;
            i++;
        }

        for (int each : arr2) {
            resultArray[i] = each;
            i++;
        }

        return resultArray ;


    }
}
