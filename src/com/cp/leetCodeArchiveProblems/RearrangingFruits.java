package com.cp.leetCodeArchiveProblems;

import java.util.*;

public class RearrangingFruits {
    public static long minCost(int[] basket1, int[] basket2) {
        //basket1 = [4,2,2,2]
        //basket2 = [1,4,1,2]
        Arrays.sort(basket1);
        Arrays.sort(basket2);
        boolean started = false;
        int start = 0;int end = 0;
        for(int i=0;i<basket1.length;i++)
        {
            if(basket1[i]==basket2[i] && !started)
            {
                System.out.println("qqq");
                start = i;
                started = true;
                System.out.println("start : " + start);
            }
            if(basket1[i]==basket2[i])
            {
                end = i;
            }
        }

        System.out.println(start + " " + end);
        Map<Integer,Integer> vals = new HashMap<>();
        Map<Integer,Integer> vals2 = new HashMap<>();
        if(start==0 && end ==basket1.length)
        {
            return 0;
        }
        if(start==0 && end<basket1.length-1)
        {

            for(int i=end+1;i<basket1.length;i++)
            {
                if(vals.get(basket1[i])==null)
                {
                    vals.put(basket1[i],1);
                }
                else{
                    vals.put(basket1[i],vals.get(basket1[i]) + 1);
                }
            }
            for(int i=end+1;i<basket1.length;i++)
            {
                if(vals2.get(basket2[i])==null)
                {
                    vals2.put(basket2[i],1);
                }
                else{
                    vals2.put(basket2[i],vals2.get(basket2[i]) + 1);
                }
            }
        }
        else if (start>0 && end ==basket1.length-1)
        {
            System.out.println("pq");
            for(int i=0;i<start;i++)
            {
                if(vals.get(basket1[i])==null)
                {
                    vals.put(basket1[i],1);
                }
                else{
                    vals.put(basket1[i],vals.get(basket1[i]) +1);
                }
            }
            for(int i=0;i<start;i++)
            {
                if(vals2.get(basket2[i])==null)
                {
                    vals2.put(basket2[i],1);
                }
                else{
                    vals2.put(basket2[i],vals2.get(basket2[i]) + 1);
                }
            }
        }
        else
        {
            for(int i=0;i<start;i++)
            {
                if(vals.get(basket1[i])==null)
                {
                    vals.put(basket1[i],1);
                }
                else{
                    vals.put(basket1[i],vals.get(basket1[i]));
                }
            }
            for(int i=0;i<start;i++)
            {
                if(vals2.get(basket2[i])==null)
                {
                    vals2.put(basket2[i],1);
                }
                else{
                    vals2.put(basket2[i],vals2.get(basket2[i]));
                }
            }
            for(int i=end+1;i<basket1.length;i++)
            {
                if(vals.get(basket1[i])==null)
                {
                    vals.put(basket1[i],1);
                }
                else{
                    vals.put(basket1[i],vals.get(basket1[i]));
                }
            }
            for(int i=end + 1;i<basket1.length;i++)
            {
                if(vals2.get(basket2[i])==null)
                {
                    vals2.put(basket2[i],1);
                }
                else{
                    vals2.put(basket2[i],vals2.get(basket2[i]));
                }
            }
        }

        int max1 = 0;
        int max2 = 0;
        for(Map.Entry<Integer,Integer> map : vals.entrySet())
        {
            if(vals.get(map.getKey())%2!=0)
            {

                return -1;
            }
            max1 = Math.max(vals.get(map.getKey()),max1);
        }
        for(Map.Entry<Integer,Integer> map : vals2.entrySet())
        {
            if(vals2.get(map.getKey())%2!=0)
            {
                System.out.println("h");
                return -1;
            }
            max2 = Math.max(vals2.get(map.getKey()),max2);
        }
        List<Integer> lst = new ArrayList<>();
        Map<Integer,Integer> finalMap = new HashMap<>();
        for(Map.Entry<Integer,Integer> map : vals.entrySet())
        {
            finalMap.put(map.getKey(),vals.get(map.getKey()));
            lst.add(map.getKey());
        }
        for(Map.Entry<Integer,Integer> map : vals2.entrySet())
        {
            finalMap.put(map.getKey(),vals2.get(map.getKey()));
            lst.add(map.getKey());
        }

        Collections.sort(lst);
        System.out.println(lst);
        int count = 0;
        int c = basket1.length-(end-start + 1);
        for(int i=0;i<lst.size() &&c>0;i++)
        {
            count = count +  lst.get(i)*finalMap.get(lst.get(i))/2;
            c = c - finalMap.get(lst.get(i));
            System.out.println("count:" + count);
        }
        return count/2;

    }
    public static void main(String[] args) {
            int nums1[] = {4,4,4,4,3};
            int nums2[]  = {5,5,5,5,3};
        System.out.println(minCost(nums1,nums2));
    }
}
