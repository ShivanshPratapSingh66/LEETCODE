class Solution {
    public int arraySign(int[] nums) {
        long mul=1;
        int count=0;
        for(int a : nums)
          {
           if(a==0) return 0;
           if(a<0)
           count++;
           
         }
          
         if(count%2==0) return 1;
         else  return -1;
       
          
        
    }
}
