import java.util.*;

public class Arrays {
	private static int sizeA = 400000000;
	private static int[] arra = new int[sizeA];

	public static void main(String[] args) {
		arraye();
		test();

	}

	public static void arraye() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < sizeA; i++) {
			arra[i] = (int) Math.random() * 9;
		}
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		System.out.println(elapsedTimeMillis + " milliseconde - " + sizeA + " - Array");
	}

	public static void test() {
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < sizeA; i++) {
			sum = sum + arra[i];
		}
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		System.out.println("Array Summation time - " + elapsedTimeMillis);

	}
}
