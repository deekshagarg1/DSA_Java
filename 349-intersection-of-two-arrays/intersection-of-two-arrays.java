class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        for(int num : nums1){
            s1.add(num);
        }

        Set<Integer> res = new HashSet<>();
        for(int num : nums2){
            if(s1.contains(num)){
                res.add(num);
            }
        }

        int k = 0;
        int[] ans = new int[res.size()];

        for(int num : res){
            ans[k++] = num;
        }
      
        return ans;
    }
}