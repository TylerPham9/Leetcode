class Solution:
    def reverseString(self, s):
        """
        Do not return anything, modify s in-place instead.
        """
        
        s.reverse()


        # s[:] = s[::-1]
        
        
        # for i in range(int(len(s)/2)):
        #     s[i], s[len(s)-1-i] = s[len(s)-1-i], s[i]

s = Solution()

text = ["h","e","l","l","o"]

s.reverseString(text)

print(text)