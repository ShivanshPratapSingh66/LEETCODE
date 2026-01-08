class Solution {
    public String triangleType(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
             count++;
        }
        if(count==0) return "equilateral";
        else if(count==1)
        { 
         if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1])
           return "isosceles";
           else
           return "none";
        } 
        else 
        {
         if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1])
           return "scalene";
           else
           return "none";
        }
        
        
    }
}
