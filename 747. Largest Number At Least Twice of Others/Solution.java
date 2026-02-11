import java.util.Arrays;
class Solution {
    public int dominantIndex(int[] nums) {

       
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int a : nums){
            if(a>max)
            max=a;
    
        }
        int idx=-1;
        for(int i=0;i<n;i++){
           if(nums[i]==max){idx=i;}
          else if (nums[i]*2>max){
            idx=-1;
            break;
          }
    
        }
        return idx;
              
    }
}
