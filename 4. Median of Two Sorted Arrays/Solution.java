class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length,n=nums2.length;
        int[] num = new int[m+n];
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j])
            num[k--]=nums1[i--];
            else
            num[k--]=nums2[j--];
        }
        while(i>=0)
        {
             num[k--]=nums1[i--];

        }
         while(j>=0)
        {
             num[k--]=nums2[j--];

        }
        if((m+n)%2!=0)
           return (double)(num[(m+n)/2]);
           else{
            int mid = (num[(m+n)/2]+(num[((m+n)/2)-1]));
            return (double)mid/2;
           }
        
    }
}
