public class MergeSort {
	
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 5, 2, 4, 7, 1, 8};
		mergeSort(array);
		for(int j = 0; j < array.length; j++) 
			System.out.print(array[j] + " ");
		System.out.println();
	}
	
	public static void mergeSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		mergeSort(array, 0, array.length-1);
	}
	
	public static void mergeSort(int[] array, int low, int high) {
		if (low >= high)
			return;
		int mid = low + (high-low) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid+1, high);
		merge(array, low, mid, high);
	}
	
	public static void merge(int[] array, int low, int mid, int high) {
		int[] aux = new int[high-low+1];
		for (int i = low; i <= high; i++)
			aux[i-low] = array[i];
		int i = low, j = mid+1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				array[k] = aux[j-low];
				++j;
			} else if (j > high) {
				array[k] = aux[i-low];
				++i;
			} else if (aux[i-low] < aux[j-low]) {
				array[k] = aux[i-low];
				++i;
			} else {
				array[k] = aux[j-low];
				++j;
			}
		}
	}
}