public class orderAgnoisticBS{
    public static void main(String[] args){
        int[] arr = {890, 674, 78, 34, 23, 12, 10, 4, 2, -1, -23, -78}; //desc 
        // int[] arr = {-22, -10, -2, 0, 2, 4,6, 9, 10, 12, 47 , 567, 5467}; //asc
        int target = -23;

        orderAgnoisticBS obj = new orderAgnoisticBS();
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

    boolean isAsc = arr[start] < arr[end];

    while(start<=end){
        int mid = start + (end - start) / 2 ;
        
        if(arr[mid]== target){
            //target found at the middle
            return mid;
        }
        
        if(isAsc == true){ // array is in ascending order
            if(arr[mid] > target){
                //mid is larger then target , so end will move to left side of mid and start remain constant
                end = mid -1;
            }else{
                // mid is smaller than target, start move to right side of mid and end remain constant
                start = mid +1 ;
            }
        }else{// array is in descending order
            if(arr[mid] < target){
            //mid is smaller then target , so end will move to left side of mid and start remain constant
            end = mid -1;
            }else{
                // mid is larger than target, start move to right side of mid and end remain constant
                start = mid +1 ;
            }
        }
       

    }
    return -1; //target not found
}

}