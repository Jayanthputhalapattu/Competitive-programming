import java.util.Arrays;

public class Linkedlst {
    static int getKth(int lo, int hi, int k) {
         int arr[] = new int[hi-lo +1];
         for(int i=0;i<arr.length;i++)
         {
             arr[i] = lo  + i;
         }
         int ans[] = new int[arr.length];
         for(int i=0;i<ans.length;i++)
         {
             ans[i] = stepsFinder(arr[i]);
         }

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
//         return  1;

         //selection sort
        for(int i=0;i<ans.length-1;i++)
        {
           for(int j=i + 1;j>0;j--)
           {
               if(ans[j-1]>ans[j])
               {
                   swap(ans,j,j-1);
                   swap(arr,j,j-1);
               }
               else{
                   break;
               }
           }
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));

        return arr[k-1];
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    static int maxElement(int arr[],int end) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                index = i;
            }


        }
        return index;

    }
        static int stepsFinder(int num)
    {
        int count = 0;
        while(num!=1)
        {
            if(num%2==0)
            {
                num = num/2;

            }
            else{
                num = num*3 + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getKth(10,15,2));
    }
}
