class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()) {
            int value = map.getOrDefault(ch,0);
            if (value == 0)
                return false;
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        return true;
    }
}
