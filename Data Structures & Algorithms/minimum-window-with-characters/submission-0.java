class Solution {
    public String minWindow(String s, String t) {
        int minLen = (int)Math.pow(10,9);
        int startIndex = -1;
        int count = 0;
        int n = s.length();
        int m = t.length();
        int l=0,r=0;
        Map<Character,Integer> freqMap = new HashMap<>();
        for(int i=0;i<m;i++) {
            freqMap.put(t.charAt(i),freqMap.getOrDefault(t.charAt(i),0)+1);
        }
        count=freqMap.size();
        while(r<s.length()) {
            if(freqMap.containsKey(s.charAt(r))) {
                freqMap.put(s.charAt(r),freqMap.getOrDefault(s.charAt(r),0)-1);
                if(freqMap.get(s.charAt(r))==0){
                    count--;
                }
            }
            while(count==0) {
                if(r-l+1<minLen) {
                    minLen=r-l+1;
                    startIndex=l;
                }
                if(freqMap.containsKey(s.charAt(l))) {
                    freqMap.put(s.charAt(l),freqMap.getOrDefault(s.charAt(l),0)+1);
                    if(freqMap.get(s.charAt(l))>0){
                        count++;
                    }
                }
                l++;
            }
            r++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minLen);
    }
}

