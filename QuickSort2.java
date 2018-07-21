//二路快速排序
public class QuickSort2 {
	
	public static void main(String[] args) {
		int[] arr = {5,2,4,6,8,3,1,9,7};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void quickSort(int[] arr) {
		if (arr == null)
			return;
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int l, int r) {
		if (l >= r) 
			return;
		int p = partition(arr, l, r);
		quickSort(arr, l, p-1);
		quickSort(arr, p+1, r);
	}
	
	private static int partition(int[] arr, int l, int r) {
		int v = arr[l];
		int i = l+1, j = r;
		while (true) {
			while (i <= r && arr[i] < v)
				i++;
			while (j > l+1 && arr[j] > v)
				j--;
			if (i > j) 
				break;
			swap(arr, i, j);
			i++;
			j--;
		}
		swap(arr, l, j);
		return j;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}