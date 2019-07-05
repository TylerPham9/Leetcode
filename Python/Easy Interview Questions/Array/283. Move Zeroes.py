class Solution:
    def moveZeroes(self, nums):
        # for i in range(len(nums)):
        #     if nums[i] == 0 and i < len(nums)-1:
        #         temp = nums[i+1]
        #         nums[i+1] = nums[i]
        #         nums[i] = temp
        # print(nums)

        # Keep track of where the zeroes are 
        zeroPos = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[i], nums[zeroPos] = nums[zeroPos], nums[i]
                zeroPos += 1
        print(nums)

s = Solution()
s.moveZeroes([0,1,0,3,12])