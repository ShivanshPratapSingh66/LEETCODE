class Solution {
    public int strStr(String haystack, String needle) {
        
        int i=0,c=0;
        while(i+needle.length()<=haystack.length())
        {
            if(needle.equals(haystack.substring(i,i+needle.length())))
            return i;
            else
            c++;

            i++;

        }
       
        return -1;
    }
}
