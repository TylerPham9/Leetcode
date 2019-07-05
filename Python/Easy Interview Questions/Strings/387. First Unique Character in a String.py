class Solution:
    def firstUniqChar(self, s):
        
        positions = {}
        for i in range(len(s)):
            if s[i] in positions:
                positions[s[i]] += [i]
            else:
                positions[s[i]] = [i]
        print(positions)
        return -1 
s = Solution()

print(s.firstUniqChar("leetcode"))