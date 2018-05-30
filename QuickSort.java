public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 5, 2, 4, 7, 1, 8};
		quickSort(array);
		for(int j = 0; j < array.length; j++) 
			System.out.print(array[j] + " ");
		System.out.println();
	}
	
	public static void quickSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		int len = array.length;
		quickSort(array, 0, len-1);
	}
	
	public static void quickSort(int[] array, int low, int high) {
		if (low >= high)
			return;
		int p = partition(array, low, high);
		quickSort(array, low, p-1);
		quickSort(array, p+1, high);
	}
	
	//使得array[low+1, j] < v并且array[j+1, i) > v
	public static int partition(int[] array, int low, int high) {
		int v = array[low];
		int j = low;
		for (int i = low+1; i <= high; i++) {
			if (array[i] < v) {
				swap(array, j+1, i);
				++j;
			}
		}
		swap(array, low, j);
		return j;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}