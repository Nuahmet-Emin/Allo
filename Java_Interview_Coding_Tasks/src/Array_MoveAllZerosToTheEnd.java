import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args){
        int[] arr1 = {0,1,2,0,9,0,0,4,110};

        System.out.println(Arrays.toString(moveZerosToTheEnd(arr1)));
    }

    public static int[] moveZerosToTheEnd(int[] arr){


        int result[] = new int[arr.length];
        int count =0;

        for (int each : arr) {

            if (each != 0) {
                result[count] = each;
                count++;
            }

        }

        return result;


    }

}
