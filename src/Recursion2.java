public class Recursion2 {
    static  int[] swap(int arr[],int i,int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return arr;
        }
    static void bubble(int arr[],int r,int c)
    {
        if (r>c)
            return;
        if (arr[c]<arr[c+1])
        {
            swap(arr,c,c+1);
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }
    public static void main(String[] args) {
        int arr[]  = {4,3,2,1};

    }
}
