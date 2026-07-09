import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class strMethods{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // String name = "Deeksha Garg";

        // System.out.println(Arrays.toString(name.toCharArray()));

        // System.out.println(Arrays.toString(name.split("a")));
        
        // System.out.println(name.toLowerCase());
        
        // System.out.println(name);
        
        // System.out.println(name.indexOf('a'));
      
        // System.out.println("     deeksaaa   ".strip());

  //palindrone function-- "madam" , "kanak" , "abcdcba"
   System.out.println("enter string : ");
   String str = sc.next();
  
   System.out.println("is palindormme : " +palindorme(str));

    }

// --------------------------------------------------
    static boolean palindorme(String str){
      
        str = str.toLowerCase();

        if(str == null || str.length() == 0){
            return true;
        }

        for(int i= 0 ; i < str.length() /2 ; i++){ // isme length() function use hota h 

            //always remember chararcter always stored in char datatype
            char start = str.charAt(i); //checking the char of that ith index
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}