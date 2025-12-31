class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int st=0,end=0;
        for(int a: nums)
        {
            st=Math.min(st,a);
            end=Math.max(end,a);
        }
        int ans=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(nums,mid,threshold))
            {
                ans=mid;
                end=mid-1;
            }
            else
            st=mid+1;

        }
        return ans;
    }
    public static boolean isPossible(int A[],int mid,int T)
    {  int sum=0;
        for(int i:A)
        {
            sum+=Math.ceil((double)i/mid);
        }
        if(sum<=T)
        return true;
        else
        return false;
    }
}
