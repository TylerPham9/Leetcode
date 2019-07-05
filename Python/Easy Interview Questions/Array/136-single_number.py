class Solution:
    def singleNumber(self, nums):

        # requires additional memory
        seen = set()

        for num in nums:
            if num in seen:
                seen.remove(num)
            else:
                seen.add(num)
        return seen.pop()


s = Solution()
print(s.singleNumber([2,2,1]))

print(s.singleNumber([4,1,2,1,2]))