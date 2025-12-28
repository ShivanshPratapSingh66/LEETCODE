class Solution {
    public int maxArea(int[] height) {
        int mostW=0,n=height.length;
        int i=0,j=n-1;
        while(i<=j)
        {
            int currW=Math.min(height[i],height[j])*(j-i);
            mostW=Math.max(mostW,currW);
            if(height[i]<height[j])
             i++;
             else
             j--;
        }
        return mostW;
    }
}
