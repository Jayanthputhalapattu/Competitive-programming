import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    static int[] cyclicSort(int arr[])
    {
        int index = 0;
        while(index<arr.length)
        {
            if (arr[index]-1!=index)
            {
                swap(arr,index,arr[index]-1);

            }
            else{
                index++;
            }
        }
        return arr;
    }
    static int[] swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    static int missingNumber(int arr[])
    {
        int index = 0;
//        int endIndex  = arr.length;
        while(index<arr.length)
        {
            if (arr[index]>=arr.length)
            {
               index++;

            }
            else if (arr[index]!=index)
            {
                swap(arr,index,arr[index]);

            }
            else{
                index++;
            }

        }
        for (int i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    static List<Integer> findDisappearedNumbers(int arr[])
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
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                if (i+ 1!=arr[i])
                {
                    ans.add(i+ 1);
                }

            }
            return ans;
    }
    public static void main(String[] args) {
//    int arr[] = {4,0,1,2};
//        System.out.println(Arrays.toString(cyclicSort(arr)));
        int arr[] = {4,3,2,7,8,2,3,1};
//        System.out.println(missingNumber(arr));
        System.out.println(findDisappearedNumbers(arr).toString());
    }

}
