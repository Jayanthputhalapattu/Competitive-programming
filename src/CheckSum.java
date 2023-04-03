import java.util.Arrays;

public class CheckSum   {
    public static int checkSum(int a,int b)
    {
        int arr[] = new int[b-a + 1];
        for(int i=0;i<b-a + 1;i++)
        {
            arr[i] = i +a;
        }
        return helper(0,0,arr,0);
    }

    public static int helper(int count,int ans,int arr[],int index)
    {
//        if(ans>)

        if(count==2 || index==arr.length)
        {
            if(ans!=0 && ans%8==0 || ans%14==0 && ans!=0)
            {
//                System.out.println(ans);
//                System.out.println(ans-arr[index-1] + " " + arr[index -1]);
                return 1;
            }
            else
                return 0;
        }
//        ans = 0;
//        System.out.println(ans + " " + arr[index]);
        int ansCount = helper(count+1,ans + arr[index],arr,index + 1) + helper(count,ans,arr,index + 1);

        return ansCount;
    }
    public static void main(String[] args)
    {
        System.out.println(checkSum(4,9));
    }
}
