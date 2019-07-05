class Solution:
    def rotate(self, matrix):
        """
        Do not return anything, modify matrix in-place instead.
        """
    
        n = len(matrix)

        # Transpose
        for i in range(n):
            for j in range(i+1, n):
                # print("Swap %d and %d" % (matrix[i][j], matrix[j][i]))
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j] 
       
        # Flip horitzontally
        for i in range(n):
            for j in range(int(n/2)):
                matrix[i][j], matrix[i][n-1-j] = matrix[i][n-1-j], matrix[i][j] 





s = Solution()

inputM = [
  [1,2,3],
  [4,5,6],
  [7,8,9]
]

s.rotate(inputM)
print(inputM)