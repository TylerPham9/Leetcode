class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        if len(nums) == 1:
            return nums
        
        index = 1
        for i in range(1, len(nums)):
            if nums[index-1] != nums[i]:
                nums[index] = nums[i]
                index += 1
        return index




print("hello")
s = Solution()
temp = [0,0,1,1,1,2,2,3,3,4]

ans = s.removeDuplicates([0,0,1,1,1,2,2,3,3,4])
print(ans)