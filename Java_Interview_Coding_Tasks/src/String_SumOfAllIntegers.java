import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_SumOfAllIntegers {

     /*
    return the sum of all integers found in the parameter String
     */

    public static void main(String[] args) {
        System.out.println(sumOfAllIntegers("12 ab 3"));
    }

    public static int sumOfAllIntegers(String str ){

        List<Character> list = new ArrayList<>();
        int sumOfIntegers = 0;

        for (char ch : str.toCharArray()) {
           if(Character.isDigit(ch)) {
               list.add(ch);
           }
        }

        for (Character character : list) {
            sumOfIntegers +=  Integer.parseInt(character + "");
        }
        return sumOfIntegers;

    }


}
