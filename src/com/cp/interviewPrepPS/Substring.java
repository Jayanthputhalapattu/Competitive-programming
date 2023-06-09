package com.cp.interviewPrepPS;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static List<String> subset(String p,String up,List<String> ans)
    {
        if(up.isEmpty())
        {
            ans.add(p);
            return ans;
        }
        char c = up.charAt(0);
        subset(p ,up.substring(1),ans);
        ans.add(p + c);
        subset(p+c,up.substring(1),ans);

        return ans;


    }
    public static void main(String[] args) {
        String name = "jayanth";
        System.out.println(subset("",name,new ArrayList<>()));
    }
}
