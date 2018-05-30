public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1,6,8,9,30,56,88,100};
		System.out.println("test");
		int index = binarySearch(arr, 56);
		System.out.println("index=" + index);
	}
	
	public static int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0)
			return -1;
		int low = 0;
		int high = array.length-1;
		
		while (low <= high) {
			int mid = low + (high-low) / 2;
			System.out.println("good");
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}