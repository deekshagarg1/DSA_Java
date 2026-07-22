import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class subset{
    public static void main(String[] args){

//subsets --  non adjacent collections (recursion & iteration)
// [3,4,5] -- [3] [4] [5] [3,4] [3,5] [ 4,5] [3,4,5]

// vvvi  -- this pattern of taking same element and removing same it become as this subset pattern


// --------------------------------------
// getting ascii value of char
char ch = 'a';
// System.out.println(ch + 0);
// System.out.println(char(ch + 0));

// -----------------------------------

// subSeq("", "abc"); //abc ab ac a bc b c  
// System.out.print(subSeq1("" , "abc")); //[abc, ab, ac, a, bc, b, c, ]

// --------------------------------------------------------
// int[] arr = {1,2,3};
// List<List<Integer>> ans  = subSet(arr);
// for(List<Integer> list : ans){
//     System.out.println(list);
// }

// ------------------------------------------
int[] arr = {1,2,2};
List<List<Integer>> ans  = subSetDuplicate(arr);
for(List<Integer> list : ans){
    System.out.println(list);
}


 }

// -----------------sub sequence-------------------------------
static void subSeq(String p , String up){
    if(up.isEmpty()){
        System.out.print(p +" ");
        return;
    }

    char ch = up.charAt(0);

    subSeq(p + ch , up.substring(1));
    subSeq(p , up.substring(1));
}

// ----------------------------------------------------
static ArrayList<String> subSeq1(String p , String up){
    if(up.isEmpty()){
       ArrayList<String> list = new ArrayList<>();
       list.add(p);
        return list;
    }

    char ch = up.charAt(0);

    ArrayList<String> left = subSeq1(p + ch , up.substring(1));
    ArrayList<String> right = subSeq1(p , up.substring(1));

    left.addAll(right);
    return left;
}

// ------------------------------------
static List<List<Integer>> subSet(int[] arr){
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    for(int num : arr){
        int n = outer.size();

        for(int i =0 ; i < n; i++){
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
    return outer;
}

// ---------------------------------------------------
static List<List<Integer>> subSetDuplicate(int[] arr){
    Arrays.sort(arr);
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());

    int start = 0 ;
    int end = 0;

    for(int i =0 ; i< arr.length; i++){

        start = 0;
        //if current and previous element is same the s = e+1;
        if( i > 0 && arr[i] == arr[i-1]){
            start = end + 1;
        }
        end = outer.size() - 1;
        int n = outer.size();

        for(int j = start ; j < n; j++){
            List<Integer> internal = new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);
        }
    }
    return outer;
}

}