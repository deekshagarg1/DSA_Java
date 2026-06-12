public class targetNumber{

   // main function----------------- 
   public static void main(String[] args){

        int[] arr = {-22, -10, -2, 0, 2, 4,6, 9, 10, 12, 47 , 567, 5467};
        int target = 100;

        targetNumber obj = new targetNumber();
        int result =  obj.targetFind(arr , target);

        if(result != -1){
            System.out.print("element is fount at index : " +result);
        }else{
            System.out.print("element is not fount : " +result);
        }
    }

  // --------------function for finding target element--------------

 int targetFind(int[] arr , int target){
    int start =0 ;
    int end = arr.length -1;

    while(start<=end){
        int mid = start + (end - start) / 2 ;
        
        if(arr[mid]== target){
            //target found at the middle
            return mid;
        }else if(arr[mid] > target){
            //mid is larger then target , so end will move to left side of mid and start remain constant
            end = mid -1;
        }else{
            // mid is smaller than target, start move to right side of mid and end remain constant
            start = mid +1 ;
        }
    }
    return -1; //target not found
}

}