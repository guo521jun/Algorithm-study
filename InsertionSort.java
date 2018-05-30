public class InsertionSort {
	
	public static void main(String[] args) {
		int[] array = {6, 3, 9, 5, 2, 4, 7, 1, 8};
		insertionSort(array);
		for(int j = 0; j < array.length; j++) 
			System.out.print(array[j] + " ");
		System.out.println();
	}
	
	//插入排序算法
	public static void insertionSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		int len = array.length;
		for(int i = 1; i < len; i++) {
			int t = array[i];
			int j = 0;
			for (j = i; j > 0 && array[j-1] > t; j--) {
				array[j] = array[j-1];
			}
			array[j] = t;
		}
	}
}