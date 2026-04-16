class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1

        while l <= r:
            mid = (l + r) // 2
            if nums[l] < target:
                l += 1
            elif nums[r] > target:
                r -= 1
            else:
                return mid
        return -1
        