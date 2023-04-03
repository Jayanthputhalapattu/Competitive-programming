//package com.cp.leetcode.greedy;
//
//import java.util.Stack;
//
//public class RemoveKdigits {
//    public static String removeKdigits(String num, int k) {
//        if(k==num.length())
//        {
//            return "0";
//        }
//        Stack<Integer> stack = new Stack<>();
//        int index = 0;
//        while(index<num.length() && k>0)
//        {
//            int sliced = Integer.parseInt(num.charAt(index)+"");
//            if(stack.isEmpty())
//            {
//                stack.push(sliced);
//            }
//            else{
//                while(!stack.isEmpty() && stack.peek()>sliced && k>0)
//                {
//                    stack.pop();
//                    k--;
//                }
//                stack.push(sliced);
//            }
//            index++;
//        }
//        String ans = "";
//
//        while(k>0 && !  stack.isEmpty())
//        {
//            stack.pop();
//            k--;
//        }
//
//        String ans = "";
//        while(!stack.isEmpty())
//        {
//            ans  =  stack.pop() +  ans;
//        }
//
//        ans = ans + num.substring(index);
//        for(int i=0;i<ans.length();i++)
//        {
//            if(ans.charAt(i)!='0')
//            {
//                ans = ans.substring(i );
//                break;
//            }
//
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        String s = "10";
//        int k = 2;
//        System.out.println(removeKdigits(s,k));
//        System.out.println(Integer.parseInt("00001"));
//    }
//}
