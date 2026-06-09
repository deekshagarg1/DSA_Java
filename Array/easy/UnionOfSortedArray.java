// 📍 UnionOfSortedArray-- gfg --Union of 2 Sorted Arrays--Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

// Examples:
// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: [1, 2, 3, 4, 5, 6, 7]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

import java.util.*;

public class UnionOfSortedArray{

    //print an arrayList --
    static void printArr1 (ArrayList<Integer> list){
         for(int ele : list){
           System.out.print( ele + " ");
        }
        System.out.println();
    }

//for simple array  printing
     static void printArr (int[] list){
         for(int ele : list){
           System.out.print( ele + " ");
        }
        System.out.println();
    }


  public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0 , j=0;
        int n1 = a.length;
        int n2 = b.length;
        
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){
                if(ans.size() == 0 || ans.get(ans.size()-1)!= a[i]){
                    ans.add(a[i]);
                }
                i++;
            }else{
                if(ans.size()==0 || ans.get(ans.size()-1)!= b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n1){
                if(ans.size() == 0 || ans.get(ans.size()-1)!= a[i]){
                    ans.add(a[i]);
                }
                i++;
        }
        
        while(j<n2){
             if(ans.size() == 0 || ans.get(ans.size()-1)!= b[j]){
                    ans.add(b[j]);
                }
                j++;
        }
        
        return ans;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of in the array 1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter terms of an array 1 : ");
        int[] arr1 = new int[n1];
        for(int i=0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter number of in the array 2 : ");
        int n2 = sc.nextInt();
    
        System.out.print("Enter terms of an array 2 : ");
        int[] arr2 = new int[n2];
        for(int i=0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print("Array 1 is : ");
        printArr(arr1);

        System.out.print("Array 2 is : ");
        printArr(arr2);
       
       ArrayList<Integer> ans = findUnion(arr1,arr2);
       System.out.println("union list is : ");
       printArr1(ans);
      
    }
}