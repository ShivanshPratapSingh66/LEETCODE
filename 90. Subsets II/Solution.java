class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subsetsWithDup(ans,curr,nums,0,true);
        return ans;

    }
    public static void  subsetsWithDup(List<List<Integer>>ans,List<Integer>curr,int[]num,int idx,boolean picked){
        if(idx==num.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        if(idx==0 || num[idx]!=num[idx-1] || picked){
            curr.add(num[idx]);
             subsetsWithDup(ans,curr,num,idx+1,true);
             curr.remove(curr.size()-1);
        }
             subsetsWithDup(ans,curr,num,idx+1,false);

    }

}
