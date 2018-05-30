public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 5, 2, 4, 7, 1, 8};
		selectionSort(array);
		for(int j = 0; j < array.length; j++) 
			System.out.print(array[j] + " ");
		System.out.println();
	}
	
	public static void selectionSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		int len = array.length;
		for(int i = 0; i < len; i++) {
			int min = i;
			for(int j = i+1; j < len; j++) {
				if (array[j] < array[min])
					min = j;
			}
			swap(array, i, min);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}