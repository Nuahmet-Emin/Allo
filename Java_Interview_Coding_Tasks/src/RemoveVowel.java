import java.util.Locale;


// Write a method removes vowels from a given string
public class RemoveVowel {


    public static void main(String[] args) {
        String str ="HEllo wOrLD";
        System.out.println(solution(str));

    }
    public static String solution(String str){

        String result = "";
        String vowels ="aeiou";

        for(int i=0; i< str.length(); i++){
            String eachChar = str.toLowerCase().charAt(i) + "";
            if(!vowels.contains(eachChar)){
                result += str.charAt(i);
            }
        }

        return result;

    }
}
