class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        hash = set()

        for i in range(len(nums)):
            if nums[i] in hash:
                return nums[i]
            hash.add(nums[i])

        