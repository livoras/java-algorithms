import edu.princeton.cs.introcs.StdOut;

public class Insertion extends SortingHelpers {
	public static void sort(Comparable[] arr) {
		int len = arr.length;
		for(int i = 1; i < len; i++) {
			for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
				exch(arr, j, j - 1);
			}
		}

	}

	public static void main(String[] args) {
		String[] toSorted = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		sort(toSorted);
		StdOut.println(isSorted(toSorted));
		print(toSorted);
	}
}
