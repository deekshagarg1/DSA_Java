import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("enter the elements of the array : ");
        for(int i =0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr1));

        // --------------------------------------------------------

        // int[] arr = {1,2,4,5,7,18,9};

        // System.out.println(isSorted(arr1,0));

        // System.out.println(isfindElement(arr1,56,0)); //array , target, index
        // System.out.println(findElementIndex(arr1,56,0)); //array , target, index
        // System.out.println(findElementIndexLast(arr1,56,arr1.length-1)); //array , target, index
        // findElementAllIndex(arr1,56,0); //array , target, index
        // System.out.println(list);

        // //returning list
        // System.out.println( findElementIndexList(arr1,56,0, new ArrayList<>())); //array , target, index

        // // calling way same function which return arrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> ans =findElementIndexList(arr1,56,0, list);
        // System.out.println("second way of returning : " +ans);

        System.out.println(findElementIndexList1(arr1, 4, 0 ));

    }

// ----------------------------------------------------
    static boolean isSorted(int[] arr, int index){
        //base condition
        if(arr.length -1 == index){
            return true; // means araay is empty or only have one element
        }

        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }

// --------------------------------------------------------
static boolean isfindElement(int[] arr, int target, int index){
    //base case
    if(arr.length == index){
        return false;
    }
    return arr[index] == target || isfindElement(arr, target , index+1);
}

// ------------------------------------------------------------------
static int findElementIndex(int[] arr, int target, int index){
    //base case
    if(arr.length == index){
        return -1;
    }
    if(arr[index] == target){
        return index;
    }else{
        return findElementIndex(arr, target , index+1);
    }
}

// --------------------------------------------------------
static int findElementIndexLast(int[] arr, int target, int index){
    //base case
    if(index == -1){
        return -1;
    }

    if(arr[index] == target){
        return index;
    }else{
        return findElementIndexLast(arr, target , index-1);
    }
}

// -------------------------------------------------------------------
static ArrayList<Integer> list= new ArrayList<>();
static void findElementAllIndex(int[] arr, int target, int index){
    //base case
    if(index == arr.length){
        return;
    }

    if(arr[index] == target){
        list.add(index);
    }
       findElementAllIndex(arr, target , index+1);
}

// --------------------------------------------------------------------
static ArrayList<Integer> findElementIndexList(int[] arr, int target, int index, ArrayList<Integer> list){
    //base case
    if(arr.length == index){
        return list;
    }
    if(arr[index] == target){
        list.add(index);
    }
        return findElementIndexList(arr, target , index+1, list);
}

// -------------------------------------------------
// ✔️ important -- return a list but do not take as argument
static ArrayList<Integer> findElementIndexList1(int[] arr, int target, int index){
    ArrayList<Integer> list= new ArrayList<>();
    //base case
    if(arr.length == index){
        return list;
    }
    if(arr[index] == target){
        list.add(index);
    }
    ArrayList<Integer> allBelowCall = findElementIndexList1(arr, target , index+1);
    list.addAll(allBelowCall);

    return list;
}

}