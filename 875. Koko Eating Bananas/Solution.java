class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st=0,end=0;
        for(int a:piles)
        {
            st=Math.min(st,a);
            end=Math.max(end,a);
        }
        int ans=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(piles,mid,h))
            {
                ans=mid;
                end=mid-1;
            }
            else
            st=mid+1;
        }
        return ans;
    }
    public static boolean isPossible(int A[] ,int mid,int h)
    {
        int sum=0;
      for (int a : A) {
    sum += Math.ceil((double)a / mid);
      }
        if(sum<=h)
        return true;
        else
        return false;
    }
}
