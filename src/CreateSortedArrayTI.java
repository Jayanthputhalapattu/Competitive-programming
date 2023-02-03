import java.util.Arrays;

public class CreateSortedArrayTI {
	
	 static int createSortedArray(int[] instructions) {
	        	
		 int nums[] = new int[instructions.length];
		 nums[0] = instructions[0];
		 int start = 0;
		 int end = 0;
		 int sum = 0;
		 
		 for(int i=1;i<instructions.length;i++)
		 {
			 int index =BinarySearch(instructions[i], start, end, nums);
			 insertAtIndex(nums, index, instructions[i], end);
			 sum+= Math.min(index, end - start + 1 - index);	
			 end++;
			 System.out.println(Arrays.toString(nums) + start  + " , " + end + " , " + sum);
		 }
		
		 return sum;
	    }
	static int[] insertAtIndex(int arr[],int index,int value,int end)
	{
		if(end>=arr.length-1)
		{
			return arr;
		}
		for(int i=end;i>=index;i--)
		{
			int temp = arr[i];
			arr[i+1]=arr[i];
			arr[i]=temp;
			
		}
		arr[index]=value;
		return arr;
	}
	 static int BinarySearch(int key,int start,int end,int arr[])
	 {
		
		 int mid = 0;
		 if(start==0 &&end==0)
		 {
			 return 1;
		 }
		 int l = start;
		 int m = end ;
		 while(start<end)
		 {
			 mid = start +  (end-start)/2;
			 
			 if(key>arr[mid])
			 {
				 start = mid + 1;
			 }
			 else
				 end = mid;
			 
//			 System.out.println("start : "  + start + " key : "  + key + "end :" + end );
			 
		 }
		
//		 System.out.println("start : "  + start + " key : "  + key + "end :" + end);
		 if(m-l==start)
		 {
			 return start + 1;
		 }
		 return start;
	 }
	public static void main(String args[])
	{
		int instructions[] = {1,3,3,3,2,4,2,1,2};
		System.out.println(createSortedArray(instructions));
//		int ques[] = {1,2,3,3,3};
//		System.out.println(BinarySearch(4, 0, ques.length-1, ques));
		
	}

}
