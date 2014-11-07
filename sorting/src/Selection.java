import edu.princeton.cs.introcs.StdOut;


public class Selection extends SortingHelpers {
	public static void sort(Comparable[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (less(arr[j], arr[min])) min = j;
			}
			exch(arr, i, min);
		}
	}

	public static void main(String[] args) {
		String[] toSorted = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		sort(toSorted);
		StdOut.println(isSorted(toSorted));
		print(toSorted);
	}
}
