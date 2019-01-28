package refactoring_gilbut.chapt02.after;

public class FindIntBreak {
	public static boolean find(int[] data ,int target) {
		boolean fiund = false;
		for (int i=0; i < data.length ; i++) {
			if (data[i] == target) {
				fiund = true;
				break;
			}
		}
		return fiund;
	}
}
