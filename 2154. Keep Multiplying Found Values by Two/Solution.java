class Solution {
    public int findFinalValue(int[] nums, int original) {
     
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==original)
            {
                original*=2;
                i=-1;
            }
             if(i==nums.length-1)
              return original;
        }
        return original;
        
    }
}
