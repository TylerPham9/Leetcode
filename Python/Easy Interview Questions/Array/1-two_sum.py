class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        pairing = {}
        # for i in range(len(nums)):
        #     if nums[i] in pairing:
        #         return [pairing[nums[i]], i]
        #     else:
        #         pairing[target - nums[i]] = i

        for index, item in enumerate(nums):
            if item not in pairing:
                pairing[target - item] = index
            else:
                return [pairing[item], index]
    

                
            

s = Solution()
ans = s.twoSum([2, 7, 11, 15], 9)


print(ans)

