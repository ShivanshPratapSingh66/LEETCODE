class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int st=Integer.MIN_VALUE;
        int end=0;
        for(int a : arr)
        {
            st=Math.max(a,st);
            end+=a;
            
        }
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(arr,mid,k))
            {
                ans=mid;
                end=mid-1;
            }
            else
            st=mid+1;
        }
        return ans;
    }
    public static boolean isPossible(int[] num,int mid,int k)
    {
        int curr=0;
        int painter=1;
        for(int i=0;i<num.length;i++){
            if(curr+num[i]<=mid)
            curr+=num[i];
            else
            {
                curr=num[i];
                painter++;
            }
        }
        if(painter<=k)
        return true;
        return false;
    }
}
