public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {6, 3, 1, 5, 2, 4, 7, 9, 8};
		bubbleSort(array);
		for(int j = 0; j < array.length; j++) 
			System.out.print(array[j] + " ");
		System.out.println();
	}
	
	//冒泡排序算法
	public static void bubbleSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		int len = array.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if (array[j] > array[j+1])
					swap(array, j, j+1);
			}
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}