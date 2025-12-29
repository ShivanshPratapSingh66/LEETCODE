class Solution {
    public int findGCD(int[] nums) {
        int min = Math.min(nums[0], nums[1]), max = Math.max(nums[0], nums[1]);
        int div = 1;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int n = 1;
        while (n++ <= min) {
            if (min % n == 0 && max % n == 0) {
                div = Math.max(div, n);

            }
        }
        return div;

    }
}
