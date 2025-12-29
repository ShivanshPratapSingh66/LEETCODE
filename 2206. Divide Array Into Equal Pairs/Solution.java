class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
                pair++;
            } else
                set.add(nums[i]);
        }
        set.clear();
        if (pair == nums.length / 2)
            return true;
        return false;

    }
}
