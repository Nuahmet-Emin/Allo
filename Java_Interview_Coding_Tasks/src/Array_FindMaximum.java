public class Array_FindMaximum {

    /*
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] nums = {1,2,4,110,-11};
        Array_FindMaximum max = new Array_FindMaximum();
        System.out.println(max.maxValue(nums));
    }

    public int maxValue(int [] nums){

        int max = Integer.MIN_VALUE;

        for (int eachNum : nums) {
            if (eachNum > max){
                max = eachNum;
            }
        }

        return max;
    }
}
