import java.util.Arrays;

public class sorting{
    public static void main(String[] args){

        int[] arr ={4,-7,6,-3,-8,2,1};

        // bubbleSort(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));

        // selectionSort(arr, arr.length, 0, 0);//taking full length for swaping 
        // System.out.println(Arrays.toString(arr));

        // int[] ans = mergeSort(arr);
        // System.out.println(Arrays.toString(ans));

        // or -- change in same array--
        // arr = mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        // mergeSortInPlace(arr, 0, arr.length);
        // System.out.println(Arrays.toString(arr));


        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }


// -----------------  BUBBLE SORT  --------------------------
    static void bubbleSort(int[] arr, int lastIndex , int currentElementIndex){

        if(lastIndex == 0){
            return;
        }

    if(currentElementIndex < lastIndex){
        if(arr[currentElementIndex] > arr[currentElementIndex +1]){
            //swap
            int temp =  arr[currentElementIndex];
            arr[currentElementIndex] = arr[currentElementIndex+1];
            arr[currentElementIndex+1] = temp;
        }
        bubbleSort(arr, lastIndex, currentElementIndex+1);
    }else{
        bubbleSort(arr, lastIndex-1, 0); // last index always decreases because max element will goes to last
    }
}


// --------------  SELECTION SORT  ------------------
    static void selectionSort(int[] arr, int l , int c, int max){//selecting the largest element and put it  in the end--- playing with indexing--
    // lastIndex == l , currentElementIndex == c

    if(l == 0){
        return;
    }

    if( c < l){
        if(arr[c] > arr[max]){
            selectionSort(arr, l, c+1, c);//if current index value is greater then max index value then max index will point to current index and current index will ris to c+1
        }else{
            selectionSort(arr, l, c+1, max); //if current index value is smaller then max index value then max index will point to same max index and current index will ris to c+1
        }  
    }else{
        //swap the value --- max index value will goes to last index, and last index value will swapped to max index
        int temp = arr[max];
        arr[max] = arr[l-1];
        arr[l-1] = temp;

        selectionSort(arr, l-1, 0, 0); //resetting the current index to start = 0 , max index indx to = 0 , for second iteration---
    }
  }

// ----------------------------------------------------

// ----------------  MERGE SORT  --------------------
  static int[] mergeSort(int[] arr){
    if(arr.length == 1){
        return arr;
    }

    int mid = arr.length/2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right); //divided left and right part of an array
}

   private static int[] merge(int[] first, int[] second){

    int[] mix = new int[first.length + second.length];
    
    int i=0;
    int j=0;
    int k=0;

    while(i < first.length && j<second.length){
        if(first[i] < second[j]){
            mix[k] = first[i];
            i++;
            k++;
        }else{
            mix[k] = second[j];
            j++;
            k++;
        }
    }

    while( j < second.length){
         mix[k] = second[j];
            j++;
            k++;
    }

     while( i< first.length){
         mix[k] = first[i];
            i++;
            k++;
    }

    return mix;
}
// -------------------------------------------------------------------


//   ----------------  MERGE SORT IN PLACE --------------------
  static void mergeSortInPlace(int[] arr, int s, int e){ // array, start, end
    if(e-s == 1){
        return;
    }

    int mid = (e+s)/2;
    mergeSortInPlace(arr, s, mid);
    mergeSortInPlace(arr, mid, e);

    mergeInPlace(arr, s, mid, e); //array , start, mid, end
}

private static void mergeInPlace(int[] arr, int s, int m, int e){

    int[] mix = new int[e-s];
    
    int i=s;
    int j=m;
    int k=0;

    while(i < m && j < e){
        if(arr[i] < arr[j]){
            mix[k] = arr[i];
            i++;
        }else{
            mix[k] = arr[j];
            j++;
        }
            k++;
    }

    while( j < e){
         mix[k] = arr[j];
            j++;
            k++;
    }

     while( i< m){
         mix[k] = arr[i];
            i++;
            k++;
    }

    for(int l = 0 ; l<mix.length ; l++){
        arr[s+l] = mix[l];
    }
}

// ----------QUICK SORT-----------------------------------------
static void quickSort(int[] num, int low, int high ){

    if(low >= high){ //reached center or have single element
        return;
    }

    int s = low; //start
    int e =  high; //end
    int m = s + (e-s)/2; //mid
    int pivot = num[m];

    while(s <= e){
        //also a reason why if its already sortd it will not swap
            while(num[s] < pivot){
                s++;
            }

            while(num[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = num[s];
                num[s] = num[e];
                num[e] = temp;
                s++;
                e--;
            }
    }

    //now my pivot is att correct index, pleae sort two halves now
    // after one pass -- both e , s are on same element --
    // low - e,s - high
    
    quickSort(num, low, e);
    quickSort(num, s, high);

 }


}