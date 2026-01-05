class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0,currSum=0;
        map.put(0,1);
        for(int a: nums)
        {
            currSum+=a;
            int diff= currSum-k;
            if(map.containsKey(diff))
            {
                ans+=map.get(diff);
               
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);

            
             
        }
        return ans;
    }
}
