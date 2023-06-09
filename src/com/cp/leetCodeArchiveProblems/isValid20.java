package com.cp.leetCodeArchiveProblems;

import java.util.Stack;

public class isValid20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(' ||c=='{' ||c=='[')
            {
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }

                char last = stack.peek();
                char present = c;
                if(present=='}' && last=='{'|| present==']'&& last=='[' || present==')' &&last=='(')
                {
                    stack.pop();
                }
            }
        }
        if(stack.size()==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s ="]]";
        System.out.println(isValid(s));
    }
}
