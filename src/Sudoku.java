public class Sudoku {
    static void sudoku(int board[][],int r,int c)
    {
        if(r== board.length-1 && c==board[0].length-1)
        {
            display(board);
            System.out.println();
            return;
        }
        if(c== board.length)
        {
            sudoku(board,r + 1,0);
            return;
        }
//        if(r==board.length-1)
//        {
//            sudoku(board,r,c+1);
//            return;
//        }
            if(board[r][c]==0)
            {
                for(int i=1;i<=9;i++)
                {
                    if(isValid(board,r,c,i))
                    {
                        board[r][c] = i;
                        sudoku(board,r,c + 1);
                        board[r][c] = 0;
                    }

                }

            }
            else{
                sudoku(board,r,c+1);
            }
    }
static boolean isValid(int[][] board,int r,int c,int val)
{
 // check row wise
    for (int col=0;col<board[0].length;col++)
    {
        if(board[r][col]==val)
        {
            return false;
        }
    }
   //check column wise
    for (int row = 0;row< board.length;row++)
    {
        if(board[row][c]==val)
        {
            return false;
        }
    }
    //check boxes
    int br = r/3;
    int bc = c/3;
    for(int i=3* br;i<3*br + 3;i++)
    {
        for (int j=3* bc;j<3*bc + 3;j++)
        {
        if(val==board[i][j])
        {
            return false;
        }
        }
    }
    return true;
}
    static void display(int board[][])
    {
        for (int row[]:board)
        {
            for (int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        int[][] board = {{5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}
    };
        int[][] board2 = {{6,0,0,0,0,3,2,0,4},
                {0,4,0,2,0,0,0,9,0},
                {0,0,8,0,0,0,0,5,0},
                {0,0,9,0,3,0,0,0,0},
                {0,0,0,6,0,0,0,0,0},
                {3,0,6,0,0,0,5,4,0},
                {8,0,3,0,0,2,4,0,0},
                {0,0,0,1,8,0,0,6,0},
                {1,6,5,0,7,0,0,0,8}};

//        sudoku(board,0,0);

        sudoku(board2,0,0);
    }
}
