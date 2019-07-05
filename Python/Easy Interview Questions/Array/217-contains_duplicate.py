class Solution:
    def containsDuplicate(self, nums):

        # Too slow

        # seen = []
        # for i in range(len(nums)):
        #     if nums[i] in seen:
        #         return True
        #     else:
        #         seen.append(nums[i])
        # return False

        # Still too slow
        # from collections import deque
        # q = deque(nums)
        

        # while len(q) > 0:
        #     if q.count(q.pop()) > 0:
        #         return True
        # return False


        ## Sets are faster
        seen = set()
        for num in nums:
            if num in seen:
                return True
            else:
                seen.add(num)
        return False



s = Solution()

print(s.containsDuplicate([1,2,3,1]))
print(s.containsDuplicate([1,2,3,4]))
print(s.containsDuplicate([1,1,1,3,3,4,3,2,4,2]))
