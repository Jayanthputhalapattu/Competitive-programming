package com.cp.prep;

import java.util.Arrays;

public class sortingAlgos {
    public static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int left[],int right[])
    {
        int newArr[] = new int[right.length + left.length];
        int ptr = 0;
        int ptr1 = 0;int ptr2 = 0;
        for(int i=0;i<left.length && i<right.length;i++)
        {
            if(left[ptr1]<right[ptr2])
            {
                newArr[ptr] = left[ptr1];
                ptr1++;
            }
            else{
                newArr[ptr] = right[ptr2];
                ptr2++;
            }
            ptr++;
        }
        while (ptr1<left.length)
        {
            newArr[ptr] = left[ptr1];
            ptr1++;
            ptr++;
        }
        while (ptr2<right.length)
        {
            newArr[ptr] = right[ptr2];
            ptr2++;
            ptr++;
        }

        return newArr;
    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start = low;
        int end = high;

        int p = start + (end-start)/2;

        while(arr[start]<arr[p])
        {
            start++;
        }
        while(arr[p]<arr[end])
        {
            end--;
        }
        if(start<=end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
         }
        quickSort(arr,start,high);
        quickSort(arr,low,end);



    }
    public static int findMaxIndex(int arr[],int end)
    {
        int maxElement = arr[0];
        int maxElementIndex = 0;
        for(int i=0;i<=end;i++)
        {
                if(arr[i]>maxElement)
                {
                    maxElement = arr[i];
                    maxElementIndex = i;
                }
        }
        return maxElementIndex;
    }
    public static int[] swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
     }
     public static int[] insertion(int arr[])
     {
         for(int i=0;i<arr.length-1;i++)
         {
             for(int j=i+1;j>0;j--)
             {
                 if(arr[j-1]>arr[j])
                 {
                     swap(arr,j,j-1);
                 }
                 else{
                     break;
                 }
             }
         }
         return arr;
     }
    public static int[] selection(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
                for(int j=1;j<=arr.length-1-i;i++)
                {
                    int maxElementIndex = findMaxIndex(arr,arr.length-i-1);
                    swap(arr,maxElementIndex,arr.length-i-1);
                }
        }
        return arr;
    }
    public static void main(String[] args) {
            int arr[] = {4,3,2,1};
//        System.out.println(Arrays.toString(selection(arr)));
        int ans[] = insertion(arr);
        System.out.println(Arrays.toString(ans));
        int mergeArr[] = {4,2,1,6,7};
        System.out.println(Arrays.toString(mergeSort(mergeArr)));
        int quicaArr[] = {500,100,200,11};
        quickSort(quicaArr,0,quicaArr.length-1);

        System.out.println(Arrays.toString(quicaArr));
    }
}
