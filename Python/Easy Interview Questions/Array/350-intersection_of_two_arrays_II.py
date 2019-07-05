class Solution:
    def intersect(self, nums1, nums2):
        
        
        # Works but what if without counters
        # from collections import Counter

        # c1 = Counter(nums1)
        # c2 = Counter(nums2)

        # return list((c1 & c2).elements())

        # Better solution doesnt use counter
        dict1 = {}
        for i in nums1:
            if i not in dict1:
                dict1[i] = 1
            else:
                dict1[i] += 1
        res = []
        for i in nums2:
            if i in dict1 and dict1[i] > 0:
                res.append(i)
                dict1[i] -= 1
        return res

s = Solution()

s.intersect([1,2,2,1], [2,2])

s.intersect([4,9,5], [9,4,9,8,4])
