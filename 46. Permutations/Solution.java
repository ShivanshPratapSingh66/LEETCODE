class Solution {
    public List<List<Integer>> permute(int[] nums) {
     
       List<List<Integer>> anss = new ArrayList<>();
            permute(anss,nums,0);
            return anss;

      
    }
    public static void swap(int num[],int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public static void permute(List<List<Integer>> ans,int[] nums,int i){
        if(i==nums.length){
            List<Integer> curr = new ArrayList<>();
            for(int a: nums)
            curr.add(a);
            ans.add(curr);
           return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            permute(ans,nums,i+1);
            swap(nums,i,j);
        }

    }
}
