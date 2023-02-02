//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class info {
//    static void swap(int[] arr,int a,int b)
//    {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//
//    }
//    static long minsSum(int n, List<Integer> A , List<Integer> B)
//    {
//        int a[] = new int[n];
//        int b[] = new int[n];
//        for(int i=0;i<n;i++)
//        {
//            a[i] = A.get(i);
//            b[i] = B.get(i);
//        }
////        Arrays.sort(a);
//        for(int i=0;i<b.length-1;i++)
//        {
//            for(int j=i + 1;j>0;j--)
//            {
//                if(b[j-1]>b[j])
//                {
//                    swap(b,j-1,j);
//                    ;
//                }
//                if(a[j-1]>a[j])
//                {
//                    swap(a,j-1,j);
//                }
//            }
//        }
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        for (int num:a)
//        {
//
//        }
//
//    }
//    public static void main(String[] args) {
//       List<Integer> a = {1,5,4};
//       List<Integer> b = {2,1,1};
//
//       minsSum(a.size(),a,b);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
