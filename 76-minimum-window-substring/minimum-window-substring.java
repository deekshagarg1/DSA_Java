class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];

        if(s.length() < t.length()){
            return "";
        }

        ///required characters
        for(char c : t.toCharArray() ){
            need[c]++;
        }

        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right <s.length(); right++){
            char c = s.charAt(right);
            window[c]++;

            if(need[c] > 0 && window[c]<=need[c]){
                count++;
            }

            while(count == t.length()){
                int currLen = right - left +1;

                if(minLen > currLen){
                    minLen = currLen;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if(need[leftChar]>0 && window[leftChar] < need[leftChar]){
                    count--;
                }

                left++;
            }
        }
            if(minLen == Integer.MAX_VALUE){
                return "";
            }
            
            return s.substring(start, start+minLen);
    }
}