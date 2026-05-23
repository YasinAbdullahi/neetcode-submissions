class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cur_sum = 0
        best_sum = float("-inf")

        for i in range(len(nums)):
            cur_sum = max(cur_sum + nums[i], nums[i])
            best_sum = max(best_sum, cur_sum)
        
        return best_sum
        