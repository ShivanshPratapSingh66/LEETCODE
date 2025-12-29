class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        while(n>1)
        {
            n/=2;
        int newnum[]=new int[n];
        for(int i=0;i<n;i++)
        {
          if(i%2==0)
            {
              newnum[i]=Math.min(nums[2*i],nums[2*i+1])  ;
            }
            else
            newnum[i]=Math.max(nums[2*i],nums[2*i+1]);
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=newnum[i];
        }
        }
        return nums[0];
    }
}
