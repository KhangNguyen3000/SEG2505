import java.util.*;

public class ArrayL {
	private static int sizeA = 400000000;
	private static ArrayList arrayL = new ArrayList(10);

	public static void arrayLi() {
		long start = System.currentTimeMillis();
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		while (arrayL.size() < sizeA) {
			arrayL.add((int) Math.random() * 9);

			elapsedTimeMillis = System.currentTimeMillis() - start;
		}
		System.out.println(elapsedTimeMillis + " milliseconde - " + arrayL.size() + " - ArrayList");
	}

	public static void main(String[] args) {
		arrayLi();
		test();

	}
	
	public static void test() {
		Iterator<Integer> arrayLI = arrayL.iterator();
		long start = System.currentTimeMillis();
		int sum = 0;
		while (arrayLI.hasNext()) {
			sum = sum + arrayLI.next();
		}
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		System.out.println("ArrayList Summation time - " + elapsedTimeMillis);

	}
	
}
