import java.math.BigInteger;
import java.util.*;

public class ShiftingLetters {
    static String shiftingLetters(String s, int[] shifts) {
            StringBuilder snew = new StringBuilder(s);
            long x = 0;
            for(int i=s.length()-1;i>=0;i--)
            {
                char ch =(char) ((s.charAt(i) +  x + shifts[i] -97)%26 + 97);
                snew.setCharAt(i,ch);
               x+= shifts[i];
            }
            return snew.toString();
    }
    static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return c+ "";
    }
    static int findMinDifference(List<String> timePoints) {
    boolean mark[] = new boolean[24*60];
    for(String hm : timePoints)
    {
        String minH[] = hm.split(":");
        int h = Integer.parseInt(minH[0]);
        int m = Integer.parseInt(minH[1]);
        mark[ h*60 + m] = true;
    }
   int min =  Integer.MAX_VALUE;
    int prev = -1;
        System.out.println(Arrays.toString(mark));
    for (int i=0;i<24*60;i++)
    {
        int diff = 0;
            if(mark[i])
            {
                if(i-prev>720)
                {
                        diff = 1440-(i-prev);
                }
                if(prev==-1)
                {
                    prev = i;

                }
                else if (i-prev <min)
                {

                    min =diff;
                }
                prev = i;
            }

    }
    return min;
    }
    static int minDiff(String a,String b)
    {
        int ah = Integer.parseInt(a.substring(0,2));
        int am = Integer.parseInt(a.substring(3));
        int bh = Integer.parseInt(b.substring(0,2));
        int bm = Integer.parseInt(b.substring(3));
        int min = 0;
        if(ah>bh && bh!=0)
        {
            if(am>bm)
            {
                    min  = min + (am-bm) + (ah-bh)*60;

            }
            else{
                min  = min + (60 -bm + am) + (ah-1 -bh) *60;
            }
        }
        else if(ah<bh && ah!=0)
        {
            if(am<bm)
            {
                min  = min + (bm-am) + (bh-ah)*60;

            }
            else{
                min  = min + (60-am + bm) + (bh-1-ah) *60;
            }
        }
        else if(ah==0 &&bh!=0){
            ah=24;
            if(am>bm)
            {
                min  = min + (am-bm) + (ah-bh)*60;

            }
            else{
                min  = min + (60 -bm + am) + (ah-1 -bh) *60;
            }
        }
        else if (bh==0 && ah!=0)
        {
            bh=24;
            if(am<bm)
            {
                min  = min + (bm-am) + (bh-ah)*60;

            }
            else{
                min  = min + (60-am + bm) + (bh-1-ah) *60;
            }
        }
        else if(ah==0 && bh==0)
        {
            min = min + Math.abs(am-bm);
        }

return min;

    }
    public static void main(String[] args) {
        int arr[] = {3,5,9};
        System.out.println(shiftingLetters("abc",arr));
        System.out.println(multiply("123","12"));
//        System.out.println(minDiff("21:00","22:59"));
        List<String> q = Arrays.asList("23:59","00:00");
        System.out.println(findMinDifference(q));
    }




}
