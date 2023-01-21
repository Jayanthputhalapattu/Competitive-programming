import java.util.Arrays;

public class SelectionSort {
    static int[] swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    static int maxElement(int arr[],int end)
    {
        int max = arr[0];
        int index = 0;
        for (int i=0;i<=end;i++)
        {
           if (arr[i]>max)
           {
               max = arr[i];
               index = i;
           }


        }
        return index;


    }
    static int[] selectionSort(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i;j++)
            {
                swap(arr,maxElement(arr,arr.length-i-1),arr.length-i-1);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4,9,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
