public class recuBinary{
    public static void main(String[] args){
        int[] arr={34,45,56,78,90,1,2,3,4}; //rotated binary search
        int target = 78;

        System.out.print(rotatedBinary(arr, target, 0, arr.length-1));
    }

    static int rotatedBinary(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return rotatedBinary(arr, target, s, m-1); //when target is grater then start but smaller then mid
            }else{
                 return rotatedBinary(arr, target, m+1, e); //when target is grater then mid but smaller then start (rotaed array k karn aesa)
            }
        }
        
        if(target >= arr[m] && target <= arr[e]){
            return rotatedBinary(arr, target, m+1, e); //when target is grater then mid but smaller then end
        }
        
        return rotatedBinary(arr, target, s, m+1); //when target is grater then mid but smaller then start (rotaed array k karn aesa)       
    }
}