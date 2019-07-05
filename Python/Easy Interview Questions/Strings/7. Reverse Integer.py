class Solution:
    def reverse(self, x):
        sign = 1 if x>0 else -1
        x = abs(x)
        rev = 0
        while x > 0:
            rev = rev * 10
            rev += x % 10 
            x = x // 10
        
        if rev > 2**31:
            return 0
        else:
            return rev*sign

s = Solution()

print(s.reverse(123))
print(s.reverse(120))
print(s.reverse(-123))
print(s.reverse(1534236469))