import java.util.Scanner;
// import java.util.Scanner;

public class question{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("enter string : ");
        // String str = sc.next();

        // skipTheChar("", str );
        // skipTheChar("",  "apple");

        //  System.out.print(skipTheCharReturn(str));

         System.out.print(skipTheStringReturn("hello this is apple, you eat", "apple"));

    }

// -----------------------------------------------------------
 static void skipTheChar(String p, String up){ //processed string, unprocessed string

    if(up.isEmpty()){
         System.out.println(p);
         return;
    }

    char ch = up.charAt(0);

    if(ch == 'a'){
        skipTheChar(p, up.substring(1)); //agar unprocessed string me char a h to usko add nhi kerna processed me
    }else{
        skipTheChar(p + ch , up.substring(1)); //agar unprocessed string me char a nhi h to usko add kerna processed me
      }
}

//  What are p and up?
// p (Processed): The part of the string you've already examined and kept.
// up (Unprocessed): The remaining part of the string that still needs to be checked.

// For example, if the input is "apple":

// Call   p          up
// 1	  ""	     "apple"
// 2	  ""	     "pple" (skipped 'a')
// 3	  "p"	     "ple"
// 4	  "pp"	     "le"
// 5	  "ppl"	     "e"
// 6	  "pple"	 ""


// -------------------------------------------------

  static String skipTheCharReturn(String up){ //processed string, unprocessed string

    if(up.isEmpty()){
         return "";
    }

    char ch = up.charAt(0);

    if(ch == 'a'){
        return skipTheCharReturn(up.substring(1)); //agar unprocessed string me char a h to usko add nhi kerna char me
    }else{
       return ch + skipTheCharReturn(up.substring(1)); //agar unprocessed string me char a nhi h to usko add kerna char me
      }
}


// -----------------------------------------------------
 static String skipTheStringReturn(String up, String target){ //processed string, unprocessed string

    if(up.isEmpty()){
         return "";
    }

    if(up.startsWith(target)){
        return skipTheStringReturn(up.substring(target.length()), target); //agar unprocessed string me char a h to usko add nhi kerna char me
    }else{
       return up.charAt(0) + skipTheStringReturn(up.substring(1), target); //agar unprocessed string me char a nhi h to usko add kerna char me
      }
}

// ---------------------------------------------------------





}