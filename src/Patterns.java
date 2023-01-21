public class Patterns {
    static void pattern1(int n)
    {
        for (int i =1;i<=n;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n)
    {
        for (int i =1;i<=n;i++)
        {
            for (int j = 0;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        int p = 2*n;
        for (int i =1;i<p;i++)
        {
           int cols = i<=n ? i : n-i + n;
            for (int j = 0;j<cols;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        System.out.println();
        pattern5(9);
    }
}
