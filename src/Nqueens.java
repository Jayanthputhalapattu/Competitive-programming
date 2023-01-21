import java.util.Arrays;

public class Nqueens {
    static int queens(boolean board[][],int r,int c)
    {
        if(r==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
  // check for every column in that particular row
        for (int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,r, col))
            {
                board[r][col] = true;
                count  = count + queens(board,r + 1,col);
//                System.out.println();
                board[r][col] = false;


            }
        }
        return count;
    }
    static boolean isSafe(boolean board[][] ,int r,int c)
    {
            //check upward,
          for (int i=0;i<r;i++)
        {
           if  (board[i][c])
           {
               return false;
           }
        }
    //check forward diagonal right
        int minRight = Math.min(r,board[0].length -1-c);
          for (int i = 1;i<=minRight;i++)
          {
              if(board[r-i][c + i])
              {
                  return false;
              }
          }
        //check diagonal left
          int minLeft  =Math.min(r,c);
          for (int i =1;i<=minLeft;i++)
          {
              if(board[r-i][c-i])
              {
                  return false;

              }
          }


          return true;
    }
    static void display(boolean board[][])
    {
        for(boolean row[]:board)
        {
            for(boolean element : row)
            {
                if(element)
                {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static  void main(String args[])
    {
            boolean[][] board = new boolean[6][6];
//            for (boolean row[]: board)
//            {
//                System.out.println(Arrays.toString(row));
//            }
        System.out.println(queens(board,0,0));
    }
}
