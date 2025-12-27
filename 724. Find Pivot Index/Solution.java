class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int[] temp=new int[nums.length];
         temp[nums.length-1]=nums[nums.length-1];
        for(int  i=nums.length-2;i>=0;i--)
        {
            temp[i]=nums[i];
            nums[i]+=nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            leftSum+=temp[i];
            if(leftSum==nums[i])
             return i;
        }
        return -1;
    }
}
