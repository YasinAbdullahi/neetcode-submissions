class Solution {
    public boolean hasDuplicate(int[] nums) {
       //[1,2,3,3]. - > [1,2,3]
       //[0,0] -> [0]
       Set<Integer> ans = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
        ans.add(nums[i]);
       }  

       if (ans.size() != nums.length) {
        //contains duplicate
        return true;
       }
       return false;
    }
}