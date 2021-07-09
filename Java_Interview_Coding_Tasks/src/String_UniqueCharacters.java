public class String_UniqueCharacters {

     /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }

    public static String uniqueCharacters(String str)   {

        String result = "";


        for (char ch : str.toCharArray()) {
           int freq = 0;
            for (char ch1 : str.toCharArray()) {
                if(ch == ch1){
                    freq ++;
                }
            }
            if(!result.contains(ch+ "") && freq == 1){
                result += ch;
            }
        }
        return  result;
    }
}
