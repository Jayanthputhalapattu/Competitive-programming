//import java.util.ArrayList;
//import java.util.List;
//
//public class PowerProgramm {
//    static int totalDiverse(String s,int n)
//    {
//       return diverse("",s,n)-1;
//    }
//    static int diverse(String p,String up,int n)
//    {
//        if(up.isEmpty())
//        {
//            System.out.print(p + " ");
//            return 1;
//        }
//        int count = 0;
//        char ch = up.charAt(0);
//        if(!p.contains(up.substring(0,1)))
//        {
//            count+=diverse(p + ch,up.substring(1),n);
//
//        }
//        count+=diverse(p,up.substring(1),n);
//        return count;
//    }
//
//    static List<Integer> candidates(int arr[], int target, int sum)
//    {
//
//
//
//    }
//    public static void main(String[] args) {
////        System.out.println(totalDiverse("jayanth",7));
//        int arr[] = {4,6,1,2};
//        System.out.println(candidates(arr,10,10,arr[0]));
//    }
//}
