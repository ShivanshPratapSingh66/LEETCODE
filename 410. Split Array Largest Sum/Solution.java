class Solution {
    public int splitArray(int[] nums, int k) {
        int st=0,end=0;
        for(int a: nums)
        {
            st=Math.max(st,a);
            end+=a;
        }
        int ans=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(nums,mid,k))
             {
                ans=mid;
                end=mid-1;
             }
             else
             st=mid+1;
        }
        return ans;

    }
    public static boolean isPossible(int A[],int mid,int k)
    {
        int maxSum=0,split=1;
        for(int i=0;i<A.length;i++)
        {
            if(maxSum+A[i]<=mid)
              maxSum+=A[i];
              else
              {
                maxSum=A[i];
                split++;
              }
        }
        if(split<=k)
        return true;
        else
        return false;

    }
}
