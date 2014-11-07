import edu.princeton.cs.introcs.StdOut;

public class Shell extends SortingHelpers {
	public static void sort(Comparable[] arr) {
		int len = arr.length;
		int h = 1;
		while(h < len / 3) h = h * 3;
		while (h >= 1) {
			for (int i = h; i < len; i++) {
				for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
					exch(arr, j, j - h);
				}
			}
			h = h / 3;
		}

	}

	public static void main(String[] args) {
		String[] toSorted = {"S", "H", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
		sort(toSorted);
		StdOut.println(isSorted(toSorted));
		print(toSorted);
	}
}
