package com.cp;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
        {
            p.add(i);
        }
        int l = k-1;
        while(l>0)
        {
            p.poll();
            l--;
        }
        return p.peek();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,3,6,4};
        System.out.println(KthLargestElement.findKthLargest(arr,2));
    }
}
