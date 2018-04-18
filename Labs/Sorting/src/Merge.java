
public class Merge {
	private static <T extends Comparable<T>> void merge(T [] arr, Object []temp, int lo, int mid, int hi) {
		int ptrlo = lo;
		int ptrmid = mid;
		for(int i = lo; i < hi; i++) {
			if (ptrlo == mid) {
				temp[i] = arr[ptrmid];
				ptrmid++;
			}
			else if (ptrmid == hi) {
				temp[i] = arr[ptrlo];
				ptrlo++;
			}
			else {
				if(arr[ptrlo].compareTo(arr[ptrmid]) < 0) {
					temp[i] = arr[ptrlo];
					ptrlo++;
				}
				else {
					temp[i] = arr[ptrmid];
					ptrmid++;
					
				}
			}
		}
		for (int i=lo; i < hi; i++) {
			arr[i] = (T) temp[i];
		}
		
	}
	
	private static <T extends Comparable<T>> void mergeSortHelper(T [] arr, Object [] temp, int lo, int hi) {
		if (hi - lo > 1) {
			mergeSortHelper(arr, temp, lo, (lo +hi)/2); 
			mergeSortHelper(arr, temp, (lo+hi)/2, hi);
			merge(arr,temp,lo,(lo+hi)/2,hi);
		}
	}
	
	private static <T extends Comparable<T>> void mergeSort(T [] arr) {
		Object temp []= new Object [arr.length];  
		mergeSortHelper(arr,temp, 0, arr.length);
	}
	
	
	public static void main(String[] args) {
		Integer[] test = {1,4,8,3,5,9};
		mergeSort(test);
		for(int i = 0; i<test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
