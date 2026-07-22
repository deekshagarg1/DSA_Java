import java.util.ArrayList;
import java.util.List;

public class leetcode{
    public static void main(String[] args){

        //  phoneLetterCombination("","12");

        //  System.out.println(phoneLetterCombinationList("","12"));

        //  System.out.println(phoneLetterCombinationCount("","12"));
        
        // System.out.println(letterCombinations("23"));

        // dice("", 4);

        // [1111, 112, 121, 13, 211, 22, 31, 4]
        System.out.println(diceReturn("",4));

    }

    // ------------------------------------------
    static void phoneLetterCombination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //it wil change '2' to 2

        for(int i = (digit-1)*3; i< digit*3 ; i++){
            char ch = (char)('a' +i);
            phoneLetterCombination(p+ch , up.substring(1));
        }
    }

    // -------------------------------------------------------
    static ArrayList<String> phoneLetterCombinationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //it wil change '2' to 2
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = (digit-1)*3; i< digit*3 ; i++){
            char ch = (char)('a' +i);
            ans.addAll(phoneLetterCombinationList(p+ch , up.substring(1)));
        }
        return ans;
    }

    // -----------------------------------------------------
      static int phoneLetterCombinationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0'; //it wil change '2' to 2
        int count = 0;
        for(int i = (digit-1)*3; i< digit*3 ; i++){
            char ch = (char)('a' +i);
            count = count + phoneLetterCombinationCount(p+ch , up.substring(1));
        }
        return count;
    }

    // -------------------------------
    // leetcode------------

  static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }

        String[] map ={
        "","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
         };

         helper("",digits, ans, map);
         return ans;
    }

    private static void helper(String p, String up, List<String> ans, String[] map){

         if(up.isEmpty()){
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        for(int i =0 ; i < letters.length(); i++){
            helper(p + letters.charAt(i) , up.substring(1), ans, map);
        }
    }


    // ------------------------------------------------
    // amazon-----------
    // dice -- ex - 4 - combination to make four in dice -- [ [4] , [2 2] , [1 1 2], [3 1], .......]

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=6 && i <= target;  i++){
            dice(p+i, target-i);
        }
    }

    // ----------------------------------
     static ArrayList<String> diceReturn(String p, int target){
        if(target == 0){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

         ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <=6 && i <= target;  i++){
            list.addAll(diceReturn(p+i, target-i));
        }

        return list;
    }

}