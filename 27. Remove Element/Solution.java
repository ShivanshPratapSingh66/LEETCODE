class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int a : nums)
        {
            if(a!=val)
           { count++;
           list.add(a);}
        }
        for(int i=0;i<count;i++){
            nums[i]=list.get(i);
        }
        list.clear();
       
       
       return count;
        
    }
}
