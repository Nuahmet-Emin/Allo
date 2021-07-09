public class Array_FirstUniqueElement {

     /*
    write a program that can find the first duplicated element from the array
     */

    public static void main(String[] args){
        int[] nums = {1,2,4,110,-11,-11};
        System.out.println("firstDuplicatedElement(nums) = " + firstDuplicatedElement(nums));
    }

    public static int firstDuplicatedElement(int[] array){

        int firstDuplicated = 0;

        for (int each1 : array) {
            int freq = 0;
            for (int each2 : array) {
                if(each1 == each2){
                    freq ++;
                }
            }

            if(freq > 1){
                firstDuplicated = each1;
            }
        }

        return firstDuplicated;

    }
}
