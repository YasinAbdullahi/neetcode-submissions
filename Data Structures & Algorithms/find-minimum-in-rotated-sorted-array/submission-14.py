class Solution:
    def findMin(self, nums: List[int]) -> int:
        res = nums[0]
        l, r = 0, len(nums) - 1

        while l <= r:
            if nums[l] <= nums[r]:
                res = min(res, nums[l])
                break
            mid = (l + r) // 2
            if nums[l] <= nums[mid]:
                res = min(res, nums[l])
                l += 1
            else:
                r -= 1
        return res