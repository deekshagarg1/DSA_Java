// class Solution {
//     public String compressedString(String word) {
//         String ans ="";
//         int count = 1;

//         for(int i = 1; i<word.length(); i++){
//             char curr = word.charAt(i);
//             char prev = word.charAt(i-1);

//             if(curr == prev){
//                 count++;
//                 //for max count == 9
//                   if (count == 9) {
//                     ans += count;
//                     ans += prev;
//                     count = 0;
//                 }
//             }else{
//                 if(count >0 ){
//                 ans +=count;
//                 ans +=prev;
//                 }
//                 count = 1;
//             }
//         }
//         if(count >0){
//         ans += count;
//         ans += word.charAt(word.length()-1);
//         }
//         return ans;
//     }
// }


// ----optimal--------------------
class Solution {
    public String compressedString(String word) {
       StringBuilder ans = new StringBuilder();
       int i = 0;

       while(i < word.length()){
            char ch = word.charAt(i);
            int count = 0;

            while(i < word.length() && word.charAt(i) == ch && count < 9){
                count++;
                i++;
            }

            ans.append(count);
            ans.append(ch);

       }

        return ans.toString();
    }
}