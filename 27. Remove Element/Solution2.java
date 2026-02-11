class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int a : nums){
            if(a!=val)
            count++;
        }
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[p]=nums[i];
                p++;
            }
        }
        return count;
        
    }
}
