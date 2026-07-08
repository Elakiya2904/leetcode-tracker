# Last updated: 7/8/2026, 3:55:49 PM
class Solution(object):
    def maxDigitRange(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ranges=[]
        for n in nums:
            digits=[int(d) for d in str(n)]
            ranges.append(max(digits)-min(digits))
        max_range=max(ranges)
        return sum(n for n,r in zip(nums,ranges)if r==max_range)
        