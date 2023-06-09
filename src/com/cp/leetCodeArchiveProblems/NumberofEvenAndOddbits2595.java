package com.cp.leetCodeArchiveProblems;

import java.util.Arrays;

public class NumberofEvenAndOddbits2595 {
    public static int[] evenOddBit(int n) {
        String bin = Integer.toBinaryString(n);
        int even = 0;
        int odd = 0;
        System.out.println(bin);
        for (int i=0;i<bin.length();i++)
        {
            int p = bin.length()-1-i;
            if(p%2==0 && bin.charAt(i)=='1')
                even++;
            else if(p%2!=0 && bin.charAt(i)=='1')
                odd++;
        }
        return new int[]{even,odd};

    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(Arrays.toString(evenOddBit(n)));
    }
}
