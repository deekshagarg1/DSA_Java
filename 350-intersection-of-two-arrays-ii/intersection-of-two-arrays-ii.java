// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//      if(nums1.length > nums1.length){
//         return intersect(nums2, nums1);
//      }   

//      Arrays.sort(nums1);
//      Arrays.sort(nums2);

//     int[] res = new int[nums1.length];

//      int i =0, j=0, k=0;

//      while(i < nums1.length && j < nums2.length){
//         if(nums1[i]==nums2[j]){
//             res[k++] = nums1[i];
//             i++;
//             j++;
//         }else if(nums1[i] > nums2[j]){
//             j++;
//         }else{
//             i++;
//         }
//      }
//      return Arrays.copyOfRange(res, 0,k);
//     }
// }


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     if(nums1.length > nums1.length){
        return intersect(nums2, nums1);
     }   

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums1){
        map.put(num, map.getOrDefault(num, 0)+1);
    }

    int[] res = new int[nums1.length];
    int k=0;
    

    for(int num: nums2){
        int count = map.getOrDefault(num, 0);

        if(count == 0){
            continue;
        }else{
            res[k++]=num;
            map.put(num, count-1);
        }
    }
   
     return Arrays.copyOfRange(res, 0,k);
    }
}