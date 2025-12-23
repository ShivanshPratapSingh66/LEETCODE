class Solution {
    public int mySqrt(int x) {
        long st=0,end=x;
        long ans=0;
        while(st<=end)
        {
            long mid = st+(end-st)/2;
            if(mid*mid<=x)
            {
                ans=mid;
                st=mid+1;
           }
           else
           end=mid-1;
        }
        return (int)ans;
        
    }
}
