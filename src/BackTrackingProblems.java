import java.util.Arrays;

public class BackTrackingProblems {
    static int maze(int n,int row,int col, String pointer)
    {
        System.out.print(pointer + " ");
        if (row==n-1 && col==n-1)
        {
            System.out.println("reached");
            return 1;

        }

        int count = 0;
        if(row!=n-1 && col!=n-1)
        {

           count = count +  maze(n,row + 1,col, "down");
           count  += maze(n,row,col + 1,"right");

        }
        else if (row==n-1)
        {
         count+=   maze(n,row,col + 1,"right");

        }
        else if (col ==n-1)
        {
          count+=  maze(n,row + 1,col,"down");

        }
        return count;
    }
    static void printpath(String p,int r,int c)
    {
        if (r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            printpath( p +"R",r -1, c);
        }
        if (c>1)
        {
            printpath( p +"D",r,c-1);
        }

    }
    static void allPath(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            allPath(p+ 'D',maze,r+1,c);

        }
        if(c<maze[0].length-1)
        {
            allPath(p + 'R',maze,r, c+1);
        }
        if(r>0)
        {
            allPath(p + 'U',maze,r -1,c );
        }
        if(c>0)
        {
            allPath(p + 'L',maze,r,c-1);
        }
         maze[r][c] = true;
    }

    static void printPath(String p, boolean maze[][],int r,int c,int[][] path,int step)
    {
        if(r==maze.length-1 && c == maze[0].length-1)
        {
            path[r][c]  = step;
            for (int nums[]:path)
            {
                System.out.println(Arrays.toString(nums));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r<maze.length-1)
        {
            printPath(p+ 'D',maze,r+1,c,path,step + 1);

        }
        if(c<maze[0].length-1)
        {
            printPath(p + 'R',maze,r, c+1,path,step + 1);
        }
        if(r>0)
        {
            printPath(p + 'U',maze,r -1,c ,path,step + 1);
        }
        if(c>0)
        {
            printPath(p + 'L',maze,r,c-1,path,step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
    public static void main(String args[])
    {
//        System.out.println(maze(3,0,0,""));
//        System.out.println();
//        printpath("",3,3);
          boolean maze[][] = {{true,true,true},{true,true,true},{true,true,true}};

//         allPath("",maze,0,0);

            int path[][] = new int[maze.length][maze[0].length];
            printPath("",maze,0,0,path,1);
    }
}
