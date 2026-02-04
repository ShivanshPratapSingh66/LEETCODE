class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      
       List<Integer> num = new ArrayList<>();
                for (int n : nums) {
                    num.add(n);
                }
       
        List<List<Integer>> ans = new ArrayList<>();
      List<Integer> curr = new ArrayList<>();
        powerSet(ans,curr,num,0);
        return ans;
    }
    public static void powerSet(List<List<Integer>>ans,List<Integer> curr,List<Integer> num,int i){
        if(i==num.size()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //.choose
         curr.add(num.get(i));
         powerSet(ans,curr,num,i+1);
        //...not choose
        curr.remove(num.get(i));
        powerSet(ans,curr,num,i+1);
    }
}
