//三路快速排序
public class QuickSort3 {
	
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
		int v = arr[l];
		//arr[l+1, lt] < v 
		int lt = l;
		//arr[lt+1, i) == v
		int i = l+1;
		//arr[gt, r] > v
		int gt = r+1;
		while (i < gt) {
			if (arr[i] < v) {
				swap(arr, lt+1, i);
				lt++;
				i++;
			} else if (arr[i] > v) {
				swap(arr, gt-1, i);
				gt--;
			} else {
				i++;
			}
		}
		swap(arr, l, lt);
		quickSort(arr, l, lt-1);
		quickSort(arr, gt, r);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}