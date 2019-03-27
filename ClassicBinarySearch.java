public class ClassicBinarySearch {

	public static void main(String[] args) {
		int nums[]= {1,2,2,4,5,5};	
		int index = binary(nums, 2);
		System.out.println(index);
	}
	
	public static int binary(int[] array,int target) {
		int head=0;
		int tail= array.length-1;
		int mid=0;
		int getMid=0;
		while(head<=tail) {
			mid=(head+tail)/2;
			getMid=array[mid];
			if(getMid>target) {
				tail=mid-1;
			}else if (getMid<target) {
				head= mid+1;
			}else {
				return mid;
			} 
		}
		return -1;
	}
}
