class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  target - num , diff = 4    
    Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // [3,3,5,6] --> [3 > 0, 3 > 1, 5 > 2, 6 > 3]
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] {i, map.get(diff)};
            }
        }
        return nums;
    }
}
