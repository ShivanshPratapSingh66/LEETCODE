class Solution {
    public int longestPalindrome(String s) {

        // Through the hashSet   
       int ans=0;
       HashSet<Character> set = new HashSet<>();
       for(char ch : s.toCharArray())
       {
              if(set.contains(ch))
              {
                ans+=2;
                set.remove(ch);
              }
              else
              set.add(ch);
       }
       return set.isEmpty()?ans:ans+1;
    }
}
