import edu.princeton.cs.introcs.StdOut;


public class SortingHelpers {
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

		
	public static void exch(Comparable[] arr, int i, int j) {
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public static boolean isSorted(Comparable[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[i - 1]) == -1) return false;
		}
		return true;
	}

	public static void print(Comparable[] arr) {
		for(Comparable item: arr) {
			StdOut.print(item);
		}
		StdOut.println();
	};

}
