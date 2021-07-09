import java.util.Arrays;

public class findFourthLargestInArray {


    public static void main(String[] args) {
        int[] arr ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8};
        System.out.println(solution(arr));

    }

    public static int solution (int [] arr){

        int result = 0;

        int temp =0;
        for(int i =0; i< arr.length; i++){
            // [2 , 56 , 0 , 25 , 1 , 75 , 9 , 8]
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        result = arr[arr.length-4];

        return result ;

    }
}
