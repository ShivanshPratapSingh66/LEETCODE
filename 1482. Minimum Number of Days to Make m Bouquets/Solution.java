class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int st=0;
        int end=0;
        if(bloomDay.length<(m*k)) return -1;
        for(int a:bloomDay)
        {   st=Math.min(st,a);
            end=Math.max(end,a);
        }
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(bloomDay,mid,k,m))
            { end=mid-1;
            ans=mid;
            }
             else
             st=mid+1;

        }
        return ans;
    }
    public static boolean isPossible(int num[] ,int mid,int k,int m)
    {
        int count=0,bkt=0;
     for(int i=0;i<num.length;i++)
     {
        if(num[i]<=mid)
          count++;
          else
          {
            bkt+=(count/k);
            count=0;
          }
     }
     bkt+=(count/k);
     if(bkt>=m)
     return true;
     else
     return false;
    }
}
