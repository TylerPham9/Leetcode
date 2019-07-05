class Solution:
    def plusOne(self, digits):
        carry = 0


        digits[len(digits)-1] += 1

        if digits[len(digits)-1] == 10:
            digits[len(digits)-1] = 0
            
            carry = 1
            k = len(digits)-2   
            while k >= 0 and carry == 1:
                digits[k] += carry

                if digits[k] == 10:
                    carry = 1
                    digits[k] = 0
                else:
                    carry = 0
                k -= 1
            if k == -1 and carry == 1:
                digits.insert(0, 1)

        
        return digits


        # num = 0
        # for i in range(len(digits)):
        #     num += num*10 + digits[i]
        # return [int(i) for i in str(num+1)]
s = Solution()

print(s.plusOne([4,3,2,9]))
print(s.plusOne([9,9,9]))
