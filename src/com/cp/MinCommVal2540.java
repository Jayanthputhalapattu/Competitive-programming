package com.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinCommVal2540 {

    public int getCommon(int[] nums1, int[] nums2) {
           int ptr1 = 0;
           int ptr2 = 0;
           int min = Integer.MAX_VALUE;
           while(ptr1< nums1.length && ptr2< nums2.length)
           {
               if(nums1[ptr1]>nums2[ptr2])
               {
                   ptr1++;
               }
               else if (nums1[ptr2]<nums2[ptr2])
               {
                   ptr2++;
               }
               else{
                   min = nums1[ptr1];
                   break;
               }
           }
        return min;
    }
    public static void main(String[] args) {

    }
}
