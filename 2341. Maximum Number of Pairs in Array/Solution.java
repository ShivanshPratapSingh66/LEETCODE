class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] ans=new int[2];
        int pair=0;
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<nums.length;i++)
       {
           if(set.contains(nums[i]))
           {
            pair++;
            set.remove(nums[i]);
           }
           else
           set.add(nums[i]);
       }
       ans[0]=pair;ans[1]=set.size();
        return ans;
    }
}
