import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> list = new ArrayList<Integer>(10); //you can also give it a size
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //static way  of inserting and fetching from index
        list.add(10);
        list.add(20);
        list.add(90);
        list.add(70);
        list.add(30);

        // System.out.print(list); //[10, 20, 90, 70, 30]

        // for(int ele : list){
        //          System.out.print(ele + " "); //list[i]-- index
        // }

        // System.out.println("index show : " +list.get(1));

        //dynamic way  of inserting and fetching from index
        // ArrayList<Integer> l1 = new ArrayList<>();

        // System.out.print("enter size of array list : ");
        // int n = sc.nextInt();

        // System.out.print("enter elements for array list : ");
        // for(int i =0; i<n ; i++){
        //     l1.add(sc.nextInt());
        // }

        // // print---
        // System.out.print("array list is : ");
        // for(int i =0 ; i<l1.size() ; i++){
        //     System.out.print(l1.get(i) + " ");
        // }

        // //remove or delete element--
        // System.out.println("removed : " + list.remove(2));

        //  //update element--
        // System.out.println("update : " + list.set(1 , -200));

        //  //--sort-- it is a void function
        //  // ascending sort
        // Collections.sort(list);
        // System.out.println("Ascending sort: " + list);

        // // descending sort
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println("Descending sort: " + list);

    
    }
}