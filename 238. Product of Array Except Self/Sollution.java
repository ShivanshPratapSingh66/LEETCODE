class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];
        int all=1,count=0;
        for(int i=0;i<arr.length;i++)
        { if(arr[i]!=0)
            all*=arr[i];
            else
            count++;

        }
        if(count==0)
       { 
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=all/arr[i];
          
        }
       }
        else if(count==1)
        {
             for(int i=0;i<arr.length;i++)
        {
             if(arr[i]!=0)
             arr[i]=0;
             else
             arr[i]=all;
          
        }
        }
        else
        Arrays.fill(arr,0);
          
        return arr;
            
        
      
        
        
    }
}
