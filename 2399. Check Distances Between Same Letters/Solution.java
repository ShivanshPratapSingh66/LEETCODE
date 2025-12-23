class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(distance[s.charAt(i)-97]!=j-i-1)
                    return false;
                }

            }
        }
        return true;
        
    }
}
