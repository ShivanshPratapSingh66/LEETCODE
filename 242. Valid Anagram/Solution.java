	

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer>m1=new HashMap<>();
        HashMap<Character,Integer>m2=new HashMap<>();
        for(char c: s.toCharArray())
        {
            if(m1.containsKey(c))
            {
                m1.put(c,m1.get(c)+1);
            }
            else
            m1.put(c,1);
        }
         for(char c: t.toCharArray())
        {
            if(m2.containsKey(c))
            {
                m2.put(c,m2.get(c)+1);
            }
            else
            m2.put(c,1);
        }
      Set<Character>c1=m1.keySet();
        Set<Character>c2=m2.keySet();
        for(char ch : c1)
        {
            if(!m2.containsKey(ch) || !m1.get(ch).equals(m2.get(ch)))
            return false;
        }
        return true;
        
    }
}
