class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        subset = []

        def backTracking(i):
            if i >= len(nums):
                res.append(subset.copy())
                return
            
            subset.append(nums[i])
            backTracking(i + 1)

            subset.pop()
            backTracking(i + 1)
        backTracking(0)
        return res
        