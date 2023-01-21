public class BinarySearchEasy {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        if (nums[end-1]<target)
            return nums.length;
        while(start<end)
        {
            int mid = (start) + (end-start)/2;
            if (target<nums[mid])
            {
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return start;
    }
    public static void main(String[] args) {
    int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr,7));
    }
}
