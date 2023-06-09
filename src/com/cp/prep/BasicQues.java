package com.cp.prep;

public class BasicQues {
    public static int reverseInteger(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum  = sum*10 + rem;
            n = n/10;

        }
        return sum;
    }
    public static boolean primeOrNot(int n)
    {

        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 245;
        System.out.println(reverseInteger(n));

        int m = 13;
        System.out.println(primeOrNot(m));
    }
}
