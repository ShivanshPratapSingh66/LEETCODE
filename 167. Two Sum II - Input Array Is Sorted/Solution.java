class Solution {
    public int[] twoSum(int[] n, int target) {
        int st=0,end=n.length-1;
        int[] ans=new int[2];
        while(st<=end){
            if(n[st]+n[end]==target)
            {
                ans[0]=st+1;
                ans[1]=end+1;
                return ans;
            }else if(n[st]+n[end]<target) st++;
            else end--;
        }
        return new int[]{-1,-1};
    }
}
