import java.util.Arrays;

public class InsertionSort {
    static int[] swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    return arr;
    }
    static  int[] insertion(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j>0;j--)
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
    public static void  main(String args[])
    {
        int arr[] = {5,3,4,1,2};
        System.out.println(Arrays.toString(insertion(arr)));

    }
}
