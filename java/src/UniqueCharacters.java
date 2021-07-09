import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabbbc";//a2b2c1
        frequency(str);

        System.out.println(frequency1(str));
        System.out.println(frequency3(str));

    }

    public static void frequency(String str){
        String result = "";
   // String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        String nonDup = "";
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
               nonDup += each;
            }
        }

        for(String each : (nonDup.split(""))){
           result +=each + Collections.frequency(list,each);
        }
        System.out.println(result);

    }

    public static String frequency1 (String str){

        String result ="";

        Set<String> nonDup = new LinkedHashSet<>(Arrays.asList(str.split("")));

//        System.out.println("nonDup = " + nonDup);

      //  ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

         for(String each : nonDup){
             int count = 0;
             for(String eachList : str.split("")){

                 if (each.equals(eachList)){

                     count++;

                 }
             }

             result += each + count;
         }
         return result;

    }


    public static String frequency3(String str ){

        String result ="";
        String nonDup ="";
        for (int i = 0 ; i <str.length(); i++){

            if(!nonDup.contains("" + str.charAt(i))){
                nonDup+=""+str.charAt(i);
            }
        }

        for (int i = 0 ; i <nonDup.length();i++){
            int count = 0 ;
            for (int j = 0 ; j<str.length();j++){

                if(nonDup.charAt(i) ==str.charAt(j)){
                    count++;
                }
            }
            result+= "" + nonDup.charAt(i) +count;
        }
        return result;
    }

    
}
