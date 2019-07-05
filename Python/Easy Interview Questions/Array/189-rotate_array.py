class Solution:
    def rotate(self, nums, k):
        """
        Do not return anything, modify nums in-place instead.
        """
        # for j in range(k):
        #     last = nums[-1]
        #     prev = nums[0]
        #     for i in range(1,len(nums)):
        #         print(nums)
        #         temp = nums[i]
        #         nums[i] = prev
        #         prev = temp
        #     nums[0] = last


        # length = len(nums)
        # newList = [0] * length
        # for i in range(length+1):
        #     newList[ (i+k) % length ] = nums[i]
        # nums = newList

        from collections import deque
        
        q = deque(nums)
        
        
        for i in range(k):
            q.appendleft(q.pop())
        nums[:] = list(q)

 




s = Solution()

nums = [1,2,3,4,5,6,7]
k = 3
s.rotate(nums, k)
print(nums)