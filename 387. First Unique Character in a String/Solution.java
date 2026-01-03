class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        for(char ch : s.toCharArray())
        {
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int i=0;
        for(char ch : s.toCharArray())
        {
            if(mp.get(ch)==1)
            return i;i++;
        }
        return -1;
        
    }
}
