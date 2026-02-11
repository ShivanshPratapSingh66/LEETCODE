import java.util.Arrays;
class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int lucky=-1,count=0;
        for(int i=0;i<arr.length;i+=count){
            int ele=arr[i];
            count=0;
            for(int j=i;j<arr.length;j++){   
            if(arr[j]==ele)
            count++;
            }
            if(count==ele)
             { lucky=ele;
             }
            
        }
        return lucky;
        
    }
}
