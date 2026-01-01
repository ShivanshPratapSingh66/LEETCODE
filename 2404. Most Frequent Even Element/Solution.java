class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int ans = -1;
        int max = 0;
        for (int a : map.keySet()) {
            if (map.get(a) > max) {
                max = map.get(a); //...... value of appreance 
                ans = a; //... key means element 
            } else if (map.get(a) == max)
                ans = Math.min(ans, a);

        }
        return ans;

    }
}
