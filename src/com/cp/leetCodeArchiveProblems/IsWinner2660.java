package com.cp.leetCodeArchiveProblems;

public class IsWinner2660 {
    public static int helper(int arr[])
    {
        int latestIndex = -1;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {

            if(latestIndex!=-1 && i-latestIndex<=2)
            {
                sum = sum + arr[i]*2;
            }
            else
                sum = sum + arr[i];
            if(arr[i]==10)
            {
                latestIndex = i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int isWinner(int[] player1, int[] player2) {
        if(helper(player1)>helper(player2))
        {
            return 1;
        }
        else if((helper(player1)<helper(player2)))
        {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = {3,5,7,6};
        int arr2[] = {8,10,10,2};
        System.out.println(isWinner(arr1,arr2));
    }
}
