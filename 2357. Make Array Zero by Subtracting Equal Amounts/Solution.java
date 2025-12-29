class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0;
        int  check=0;
        int change = 0;

       
        while (check != nums.length) {
 // if check is not equals length means there are some non-zero elements in array so reset check to 0 
              check=0;
               int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] > 0) 
                    min = Math.min(min, nums[i]);
            }
     //......loop for change the values  ...
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] != 0) {
                    change = 1;
                    nums[j] -= min;
                }
                if (nums[j] == 0)
                    check++;
            }
            if (change == 1)  //..if change !=0 means change is occure inside the loop 
             {
                op++;
                change = 0;
            }
        }
        return op;

    }
}
