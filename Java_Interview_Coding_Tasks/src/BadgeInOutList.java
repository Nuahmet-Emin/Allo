import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BadgeInOutList {

    public static void main(String[] args) {
        String[][] arr = {{"Paul","Badge In"},
                          {"Paul","Badge In"},
                          {"Paul","Badge Out"},
                          {"Paul","Badge Out"},
                          {"Tom","Badge Out"},
                          {"Tom","Badge Out"},
                {"Tom","Badge Out"}


        }   ;

        System.out.println(checkBadgeStatus(arr));
    }

    public static List<List<String>> checkBadgeStatus(String[][] arr){



        List<List<String>> result = new ArrayList<>();
        List<String> notBadgeOut = new ArrayList<>();
        List<String> notBadgeIn = new ArrayList<>();

        Set<String> uniqueName = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueName.add(arr[i][0]);
        }
// this is so hard

        for (String eachName : uniqueName) {
            int count = 0;
            String name = eachName;

            for (int j = 0; j < arr.length ; j++) {
                String status = arr[j][1];
                if (name.equals(arr[j][0])){
                    if( arr[j][1].equals("Badge In")){
                        count++;
                    }else{
                        count--;
                    }
                }
            }
            if(count >0 && !notBadgeOut.contains(name)){
                notBadgeOut.add(name);
            }
            if(count < 0&& !notBadgeIn.contains(name)) {
                notBadgeIn.add(name);
            }

        }

        result.add(notBadgeIn);
        result.add(notBadgeOut);

        return result;
    }
}
