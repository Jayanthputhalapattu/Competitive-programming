import java.util.Arrays;

public class QuickSort {
//    static int[] mergeSort(int arr[],int start,int end)
//    {
//        if(start==end)
//        {
//            return arr;
//        }
//    }
    static void quickSort(int arr[],int low ,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end-start)/2;
        int p = arr[mid];


        while(arr[start]<p)
        {
            start++;
        }
        while(arr[end]>p)
        {
            end--;
        }
        if(start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end ] =  temp;
            start++;
            end--;
        }
        ///pivot is at correct index...please sort two halves;
        quickSort(arr,start,high);
        quickSort(arr,low,end);


    }

    public static void main(String[] args) {
            int arr[]  = {6,5,3,2,1,4};
            quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


}
