class Solution {
    public int trap(int[] height) {
        int ans=0,max=0,n=height.length;
        int[] left=new int[n];int[] right=new int[n];
        for(int i=0;i<n;i++)
        {
            left[i]=max;
            max=Math.max(max,height[i]);
        }
        max=0;
        for(int i=n-1;i>=0;i--)
        {
            right[i]=max;
            max=Math.max(max,height[i]);
        }
        for(int i=0;i<n;i++)
        {
            int water=Math.min(left[i],right[i])-height[i];
            if(water>0)
            ans+=water;
        }
        return ans;
    }
}
