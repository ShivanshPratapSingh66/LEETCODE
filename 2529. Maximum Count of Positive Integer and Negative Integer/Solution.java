class Solution {
    public int maximumCount(int[] nums) {
     //..0(n) time complexity 
     /*......................................
        int neg=0,pos=0;
        for(int a : nums){
            if(a<0)
            neg++;
            else if(a>0)
            pos++;
        }
        return (neg>=pos?neg:pos);
        */

      //....0(log n) time complexity  
        //......................................
        return (negCount(nums)>=posCount(nums)?negCount(nums):posCount(nums));
    }
        public static int negCount(int[] num){
            int neg=-1;
            int st=0,end=num.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(num[mid]>=0)
                end=mid-1;
                else
                {
                    neg=mid;
                    st=mid+1;
                }
            }
            return neg+1;
        }
        //.............................................................................
        public static int posCount(int[] num){
            int pos=-1;
            int st=0,end=num.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(num[mid]>0)
                {
                    pos=mid;
                    end=mid-1;
                }
                else
                st=mid+1;
            }
            if(pos==-1) return 0;
            return (num.length-pos);
        }
    
}
