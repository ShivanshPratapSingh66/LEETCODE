class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list =  new ArrayList<>();
        Arrays.sort(nums);
        int count=0,num=0;
       for(int a : nums){
        if(a==target)
          count++;
          if(a<target)
          num++;
        
       }
       while(count>0){
        list.add(num);
        num++;count--;
       }
       return list;
        
    }
}
