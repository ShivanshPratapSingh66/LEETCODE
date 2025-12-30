class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int st=0,end=0;
        for(int a: weights)
        {  st=Math.max(st,a);
            end+=a;
        }
        int ans=0;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isValid(weights,mid,days))
             { end=mid-1;
             ans=mid;
             }
              else
              st=mid+1;
              
        }
        return ans;
    }
    public static boolean isValid(int num[],int mid,int t_day){
        
            int w8=0,day=1;
            for(int i=0;i<num.length;i++)
            {
                if(num[i]+w8 <=mid)
                 w8+=num[i];
                 else
                 {  w8=num[i];
                    day++;
                 }
            }
            if(day<=t_day)
            return true;
            else
            return false;
    }
}
