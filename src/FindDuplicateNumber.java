import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNumber {
    static int[] swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    static int firstMissingPositive(int arr[])
    {
        int index = 0;
        while(index <arr.length)
        {
            if (arr[index] >0 && arr[index]<arr.length && arr[index]-1!=index && arr[index]!=arr[arr[index]-1])
            {
                swap(arr,arr[index]-1,index);
            }
            else{
                index++;
            }

        }
//        return arr;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]-1!=i )
                return i + 1;
        }
        return -1;
    }

    static int findDuplicate(int arr[])
    {
        int index = 0;
        while(index<arr.length)
        {
            if (arr[index]-1!=index && arr[index]!=arr[arr[index]-1])
            {
                swap(arr,arr[index]-1,index);
            }
            else{
                index++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if (i+ 1!=arr[i])
            {
               return arr[i];
            }

        }
        return -1;
    }
    static int[] findErrorNums(int arr[])
    {
        int index = 0;
        int ans[] = new int[2];
        while(index<arr.length)
        {
            if (index>0 && arr[index]-1!=index && arr[index]!=arr[arr[index]-1])
            {
                swap(arr,arr[index]-1,index);
            }
            else{
                index++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if (i+ 1!=arr[i])
            {
               ans[0] = arr[i];
               ans[1] = i + 1;

            }

        }
        return ans;
    }
    public static void main(String[] args) {
//        int arr[] = {1,3,4,2,2};
        int arr[] ={1,2,4};
//         System.out.println(findDuplicate(arr));
//        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println((firstMissingPositive(arr)));
    }
}
