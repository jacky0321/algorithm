package algorithm;

public class test031 {

	public static int binSearch(int[] arrays, int target) {
		int start = 0;
		int end = arrays.length - 1;
		int middle = 0;
		int val = 0;

		while (start <= end) {
			middle = (start + end) / 2;
			val = arrays[middle];
			if (target == val) {
				return middle;
			} else if (target < val) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}

		}

		return -1;
	}

	public static int binSearchCur(int[] arrays, int target, int start, int end) {
		int middle = (start + end) / 2;
		int val = arrays[middle];
		
		if (target == val) {
			return middle;
		} else if (target < val) {
			end = middle - 1;
		} else {
			start = middle + 1;
		}

		if (start <= end) {
			return binSearchCur(arrays, target, start, end);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arrays = { 1, 2, 3, 4, 5, 6, 7 };
//		System.out.println(binSearch(arrays, 2));
		System.out.println(binSearchCur(arrays, 17, 0, arrays.length - 1));

	}
}
