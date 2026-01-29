class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=count(nums,nums[i]);
        }
        return ans;
    }
    public static int count(int[] A,int a){
        int count=0;
        for(int i=0;i<A.length;i++){
           if(A[i]<a)
           count++;
        }
        return count;
    }
}
