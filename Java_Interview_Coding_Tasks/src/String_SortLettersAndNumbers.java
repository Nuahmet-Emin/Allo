import java.util.ArrayList;
import java.util.List;

public class String_SortLettersAndNumbers {

    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"
     */

    public static void main(String[] args) {



    }

    public static String sortLettersAndNumbers (String str){
        List<Character> list = new ArrayList<>();
        char [] chars = str.toCharArray();

        String result = "";

        for (int i=0; i< str.length(); i++) {
            String temp = "";
           if( Character.isAlphabetic(chars[i]) ){
               if(Character.isDigit(chars[i+1])){

               }

           }else{
               break;
           }
        }
        return null;
    }
}
