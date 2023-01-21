public class Recursion {
    static int fib(int n)
    {
        if (n==1|| n==0)
            return n;
        else {

            return fib(n - 1) + fib(n - 2);
        }
    }
    static int binarysearch(int[] arr,int start,int end,int target)
    {
        int mid = (start) + (end-start)/2;
        if (start>end)
        {
            return -1;
        }
        if (arr[mid] == target)
            return mid;
        else if(target<arr[mid])
          return   binarysearch(arr,start,mid-1,target);
        else
            return binarysearch(arr,start + 1,end,target);
    }
    static  int sumofDigits(int n)
    {
        if(n/10==0)
            return n;
        return n%10 + sumofDigits(n/10);
    }
    static  int prodfDigits(int n)
    {
        if(n/10==0)
            return n;
        return n%10 * prodfDigits(n/10);
    }
    static int reverseNumber(int n)
    {
        if (n/10==0)
        {
            return n;
        }
        else{
            int lastNum = n%10;
            return lastNum*((int)Math.pow(10,counter(n))) +  reverseNumber(n/10);

        }

    }
    static int counter(int n)
    {
        int count=-1;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        return count;
    }
    static  int numberOfSteps(int num)
    {

    return helper(num,0);
    }
    static int helper(int num,int count)
    {
        if (num==1)
            return count + 1;
        if (num%2==0)
        {
            return helper(num/2,count + 1);
        }

        return helper(num-1,count + 1);
    }
    static int seccounter(int n,int count)
    {
        if (n/10==0)
            return count + 1;
        return seccounter(n/10,count + 1);
    }
    public static void main(String[] args) {
//        System.out.println(fib(7));
        int n = 8;
//        for (int i=0;i<n;i++)
//        {
//            System.out.println(fib(n));
//        }
        int arr[] = {4,7,12,16,19,24};
        int target = 22;
        System.out.println(binarysearch(arr,0,arr.length-1,target));

        System.out.println("=======");
        System.out.println(sumofDigits(4567));
        System.out.println(prodfDigits(23490));
        System.out.println("=======");
        System.out.println(reverseNumber(1234));
//        System.out.println(palindromeNum(1000011));
        System.out.println(numberOfSteps(8));
    }

}
