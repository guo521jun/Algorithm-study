public class MaxHeap {
	
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap(10);
		heap.insert(16);
		heap.insert(21);
		heap.insert(30);
		heap.insert(13);
		heap.insert(28);
		heap.insert(61);
		heap.insert(18);
		System.out.println("size=" + heap.size());
		int max = heap.extractMax();
		System.out.println("max=" + max);
		System.out.println("size=" + heap.size());
	}
	
	private int[] data;
	private int count;
	private int capacity;
	
	public MaxHeap(int cap) {
		data = new int[cap+1];
		count = 0;
		this.capacity = cap;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void insert(int k) {
		if (count+1 >= capacity)
			return;
		data[count+1] = k;
		++count;
		shiftUp(count);
	}
	
	public int extractMax() {
		if (count <= 0)
			return -1;
		int v = data[1];
		swap(data, 1, count);
		--count;
		shiftDown(1);
		return v;
	}
	
	private void shiftUp(int k) {
		while (k > 1 && data[k] > data[k/2]) {
			swap(data, k, k/2);
			k /= 2;
		}
	}
	
	private void shiftDown(int k) {
		while (2*k <= count) {
			int j = 2*k;
			if (j+1 <= count && data[j+1] > data[j])
				++j;
			if (data[k] > data[j])
				break;
			swap(data, k, j);
			k = j;
		}
	}
	
	public void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}