class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
          Set<Character>st=mp.keySet();
        for(char ch : s.toCharArray())
        {
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int ans=0,odd=0;
        boolean oDD=false;
        for( char ch : st)
        {
            if((mp.get(ch))%2==0) 
            ans+=mp.get(ch);
            else
            {ans+=mp.get(ch)-1;
            oDD=true;}

        }
        if (oDD)
        return (ans+odd+1);
        else
        return(ans+odd);

    }
}
