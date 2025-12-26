class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int end=letters.length-1;
        char ch=letters[0];
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(target<letters[mid])
             end=mid-1;
             else if(target<letters[mid])
            st=mid+1;
             else
             st=mid+1;
        }
        return letters[st%letters.length];
        
    }
}
