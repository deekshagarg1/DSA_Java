class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        //checcking and increasing the value of char
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i <s.length(); i++ ){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        //decreasing the value of char till zero
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty(); //if map is empty then all char are matched so return true
    }
}