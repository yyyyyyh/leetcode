/**
 * [36.有效的数独](https://leetcode-cn.com/problems/valid-sudoku/)
 */
public class validSudoku36 {

    public boolean isValidSudoku(char board[][]) {
        int length = board.length;
        int[][] line = new int[length][length];
        int[][] column = new int[length][length];
        int[][] cell = new int[length][length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                // 当前值
                int num = board[i][j] - '0' - 1;
                // 当前单元格
                int k = i / 3 * 3 + j / 3;
                if(line[i][num] > 0 || column[i][num] > 0 || cell[k][num] > 0){
                    return false;
                }
                line[i][num] = column[j][num] = cell[k][num] = 1;
            }
        }

        return true;
    }

}
