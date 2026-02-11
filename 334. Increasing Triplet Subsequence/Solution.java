class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)return false;
        int fst=Integer.MAX_VALUE;
        int sec=Integer.MAX_VALUE;
        int thi=Integer.MAX_VALUE;
       for(int ele : nums){
        if(fst>=ele)
        fst=ele;
        else if(sec>=ele)
        sec=ele;
        else{
            thi=ele;
            return true;
        }
       }
        return false;
        
    }
}
