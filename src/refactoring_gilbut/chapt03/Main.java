package refactoring_gilbut.chapt03;

import java.util.Random;

import refactoring_gilbut.chapt03.after.SortSampleAfterAssert;
import refactoring_gilbut.chapt03.befor.SortSampleBefore;

public class Main {

	private static final Random rnd = new Random(1234);
	
	public static void main(String[] args) {
		excute(10);
		excute(10);
		excute(10);
		excute(10);
		excute(10);
		
		excute_after(10);
		excute_after(10);
		excute_after(10);
		excute_after(10);
		excute_after(10);
	}
	
	private static void excute(int length) {
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(data.length);
		}
		SortSampleBefore sortSampleBefore = new SortSampleBefore(data);
		System.out.printf("%6s : %s%n","BEFOR",sortSampleBefore);
		sortSampleBefore.sort();
		System.out.printf("%6s : %s%n","AFTER",sortSampleBefore);
		System.out.println();
	}
	
	private static void excute_after(int length) {
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(data.length);
		}
		SortSampleAfterAssert sortSampleBefore = new SortSampleAfterAssert(data);
		System.out.printf("%6s : %s%n","BEFOR",sortSampleBefore);
		sortSampleBefore.sort();
		System.out.printf("%6s : %s%n","AFTER",sortSampleBefore);
		System.out.println();
	}

}
