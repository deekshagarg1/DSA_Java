class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int low = 0;
        int ans = 0;

        for(int high = 0; high < s.length(); high++){
            freq[s.charAt(high)]++;

            while(freq[s.charAt(high)] > 1){
                freq[s.charAt(low)]--;
                low++;
            }

            ans = Math.max(ans, high - low + 1);
        }
        return ans;
    }
}