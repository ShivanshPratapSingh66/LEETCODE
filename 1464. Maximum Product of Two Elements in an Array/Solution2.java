class Solution {
    public int maxProduct(int[] nums) {
        int max=-1;
        int sMax=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max)
            {  sMax=max;
                max=nums[i];}
            else if(nums[i]<max && nums[i]>=sMax)
            sMax=nums[i];
        }
        System.out.println("max "+max+"smax"+sMax);
        return((max-1)*(sMax-1));
    }
}
