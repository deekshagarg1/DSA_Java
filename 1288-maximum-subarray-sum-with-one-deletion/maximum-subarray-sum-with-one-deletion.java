// class Solution {
//     public int maximumSum(int[] arr) {
//         int noDelete = arr[0];
//         int ans = arr[0];
//         int oneDelete = 0;

//         for(int i =1 ; i <arr.length; i++){
//             int oldNoDelete = noDelete;

//             noDelete = Math.max(arr[i], noDelete + arr[i]);

//             oneDelete = Math.max(oldNoDelete, oneDelete + arr[i]);

//             ans = Math.max(ans,  Math.max(noDelete, oneDelete));
//         }
//         return ans;
//     }
// }

// noDelete
// = max(current, previous + current)

// oneDelete
// = max(oldNoDelete, previousOneDelete + current)












class Solution {
    public int maximumSum(int[] arr) {
       int noDelete = arr[0];
       int oneDelete = 0;
       int ans = arr[0];

       for(int i =1; i<arr.length; i++){
            int oldSum = noDelete;

            noDelete = Math.max(arr[i], noDelete + arr[i]);

            oneDelete = Math.max(oldSum, oneDelete+arr[i]);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
         }
         return ans;
    }
}
