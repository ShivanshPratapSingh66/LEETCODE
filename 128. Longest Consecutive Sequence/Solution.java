class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int a : nums)
        {
            map.put(a,true);
        }
        for(int a : nums)
        {
            if(map.containsKey(a-1))
            map.put(a,false);
        }
        int count=0,longest=0;
        for(int a : map.keySet())
        {
            if( map.get(a)==true )
            {
                count=1;
                while(map.containsKey(a+count))
                {
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
        
    }
}
