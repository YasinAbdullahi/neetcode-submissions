class Solution {
    public boolean hasDuplicate(int[] nums) {
        //1,2,3,3 --> //1,2,3
        //[] --> [] false
        //1.2.3.4 --> 1,2,3,4
        //10,10,10 --> //[]
        Set<Integer> ans = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            ans.add(nums[i]); //[1,2,3,4] //[1,2,3]
        }

        if (ans.size() != nums.length) {//!duplicate
        return true;
    }
    return false;


}
}