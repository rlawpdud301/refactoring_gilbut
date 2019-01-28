package refactoring_gilbut.chapt02.after;

public class FindIntReturn {
	public static boolean find(int[] data ,int target) {
		for (int i=0; i < data.length ; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false;
	}
}
