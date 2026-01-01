class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map= new HashMap<>();
        String[] ans=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=heights.length-1;
        for(int i=0;i<heights.length;i++)
        {
            ans[i]=map.get(heights[j--]);
        }

        return ans;
        
    }
}
