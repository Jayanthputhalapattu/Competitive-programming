package com.cp.leetcode.greedy;

public class MaxrrepOpt1 {
    public static String swapChar(String s,int p,int q)
    {
        char[] chars =s.toCharArray();
        char temp = chars[p];
        chars[p] = chars[q];
        chars[q] = temp;
        String str = new String(chars);
        return str;

    }
    public static int maxRepOpt1(String text) {
       String copy = new String(text);
       int index = 1;
       int count = 1;
       int ptr = 1;int ans = 0;
       boolean isSwapped = false;
       char currentchar = text.charAt(0);

       while(index<text.length() && ptr<text.length())
       {

           if(text.charAt(ptr)==text.charAt(ptr-1))
           {
               count++;
               ptr++;
               if(ptr==text.length())
               {
                   ans = Math.max(ans,count);
               }
           }
           else{
               int ind = text.indexOf(currentchar,ptr);
               while(ind>=0)
               {
//                   System.out.println(ind);

                   if(ind!=-1 &&!isSwapped)
                   {
                        text = swapChar(text,ptr,ind);
                        isSwapped = true;
                        count++;
                   }

                   else {
                       text = copy;
                       currentchar = text.charAt(index);
                       ind = text.indexOf(currentchar, ind + 1);
                       isSwapped = false;
                   }
               }
               index ++;
               ans = Math.max(ans,count);
               count = 1;
               ptr = index;
           }
       }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aaabbaaa";
        System.out.println(maxRepOpt1(s));
    }
}
