package ProgrammingModel;

public class BinarySearch {
	
	public static int indexOf(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if (key > a[mid]) lo = a[mid];
			else if (key < a[mid]) hi = a[mid];
			else return mid;
		}
		return -1;
	}
}
