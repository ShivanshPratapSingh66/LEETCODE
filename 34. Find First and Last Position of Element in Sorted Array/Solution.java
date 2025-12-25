class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] arr = new int[2];
       arr[0]=hii(nums,true,0,nums.length-1,target);
        arr[1]=hii(nums,false,0,nums.length-1,target);
        return arr;
    }
    public int hii(int[] nums,boolean isStarting, int st,int end,int target)
    {
         
      
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(isStarting)
                 end=mid-1;
                 else
                 st=mid+1;
            }
            else if(nums[mid]<target)
            st=mid+1;
            else
            end=mid-1;
          
        }
        return ans;
    }
}
