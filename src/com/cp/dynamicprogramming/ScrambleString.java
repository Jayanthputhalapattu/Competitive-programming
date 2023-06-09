package com.cp.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString {
    public static Map<String,Boolean> map = new HashMap<>();
    public static boolean scrambleString(String a,String b)
    {

        System.out.println("a : " + a + ", b : " + b);

        if(a.compareTo(b)==0)
        {
            return true;
        }
        if(a.length()<=1)
        {
            return false;
        }
        String key = a;
        key+=" ";
        key = key + b;
        if(map.get(key)!=null)
        {
            return map.get(key);
        }

        boolean flag = false;
        for(int i=1;i<=a.length()-1;i++)
        {
            if(scrambleString(a.substring(0,i),b.substring(b.length()-i)) && scrambleString( a.substring(i,a.length()), b.substring(0,b.length()-i)))
            {
                flag = true;
            }
            if(scrambleString(a.substring(0,i),b.substring(0,i)) && scrambleString( a.substring(i), b.substring(i)))
            {
                flag = true;
            }
        }
        map.put(key,flag);
        return flag;

    }
    public static void main(String[] args) {
            String a = "great";
            String b = "rgatf";
        System.out.println(scrambleString(a,b));
    }
}
