class Solution {
    public int majorityElement(int[] nums) {
        int pAns=nums[0];
        int vote=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pAns)
            vote++;
            else
            vote--;
            if(vote==0)
           { pAns=nums[i];
           vote=1;}
        }
        return pAns;
        
    }
}
