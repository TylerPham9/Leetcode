class Solution:
    def isValidSudoku(self, board):

        # Check row
        valid = False
        for row in board:
            valid = self.__verifyLine(row)
            if not valid:
                return False

        # Check Column
        for i in range(9):
            col = [row[i] for row in board]
            valid = self.__verifyLine(col)
            if not valid:
                return False

        # Check 3x3
        for i in range(0, 3):
            # get 3 rows
            subBoard = board[i*3:(i+1)*3]
            for j in range(0,3):
                # turn 3 rows into 3x3
                subSection = [sublist[j*3:(j+1)*3] for sublist in subBoard] 

                # flatten the list
                line = []
                for sublist in subSection:
                    for item in sublist:
                        line.append(item)

                valid = self.__verifyLine(line)
                if not valid:
                    return False

        return True
    
    def __verifyLine(self, line): 
        # seen = set()
        # for cell in line:
        #     if cell != "." and cell in seen:
        #         return False
        #     else:
        #         seen.add(cell)
        # return True
        nums = [i for i in line if i != '.']
        return len(nums) == len(set(nums))




s = Solution()
board = [
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]

print(s.isValidSudoku(board))


        
