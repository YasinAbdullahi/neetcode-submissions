class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> ans = new HashSet<>();

       for (int i = 0; i < nums.length; i++) {
        ans.add(nums[i]);  //[1,2,3,4] -> [1,2,3,4]
        //[1,2,2] -> [1,2]
       } 

       if(ans.size() != nums.length) {
        return true;
       }

       return false;
    }
}