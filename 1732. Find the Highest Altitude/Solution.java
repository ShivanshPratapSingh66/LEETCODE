class Solution {
    public int largestAltitude(int[] gain) {
       
       int[] temp = new int[gain.length+1];
       temp[0]=0; int ans=temp[0];
        for(int i=0;i<gain.length;i++)
        {
           
           temp[i+1]=temp[i]+gain[i];
        }
        for(int i=1;i<temp.length;i++)
        {
            ans=Math.max(ans,temp[i]);
        }
        return ans;
        
    }
}
