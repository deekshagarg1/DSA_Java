class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0;
        int maxFreq = 0;
        int ans = 0;

        for(int high = 0; high < s.length(); high++){
            int index = s.charAt(high) - 'A';
            freq[index]++; //freq increase ker rahe h particular element ki

            maxFreq = Math.max(maxFreq, freq[index]);

            while( (high - low + 1) - maxFreq > k){
                freq[s.charAt(low) - 'A']--;
                low++;
            }
            ans = Math.max(ans,  high - low + 1);
        }
        return ans;
    }
}