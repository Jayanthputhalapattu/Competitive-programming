package com.cp;

import java.util.Stack;

public class removeDuplicates {
    public static boolean isPresent(char p ,char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==p)
            {
                return true;
            }
        }
        return false;
    }
    public static char[] removeItem(char p,char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==p)
            {
                arr[i] = ' ';
                break;
            }
        }
        return arr;
    }

    public static String removeDuplicateLetters(String s)
    {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        char arr[] = new char[s.length()];

        while(index<s.length())
        {
            if(!isPresent(s.charAt(index),arr)) {
                while (!stack.isEmpty() && stack.peek().compareTo(s.charAt(index)) > 0) {
                    char removed = stack.pop();//
                    if (isPresent(removed, arr)) {
                        removeItem(removed, arr);
                    }
//     make the element to true or remove the elements from the array
                }
                stack.push(s.charAt(index));
                arr[index] = s.charAt(index);
            }

            index++;
        }


        return stack.toString();
    }
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
