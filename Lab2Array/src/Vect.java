import java.util.*;

public class Vect {

	private static int sizeA = 400000000;
	private static Vector vect = new Vector(10);

	public static void vectors() {

		long start = System.currentTimeMillis();
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		while (vect.size() < sizeA) {
			vect.add((int)Math.random() * 9);
			elapsedTimeMillis = System.currentTimeMillis() - start;
		}
		System.out.println(elapsedTimeMillis + " milliseconde - " + vect.size() + " - Vectors");
	}

	public static void main(String[] args) {
		vectors();
		test();

	}
	
	public static void test() {
		Iterator<Integer> vectI = vect.iterator();
		long start = System.currentTimeMillis();
		int sum = 0;
		while (vectI.hasNext()) {
			sum = sum + vectI.next();
		}
		long elapsedTimeMillis = System.currentTimeMillis() - start;
		System.out.println("Vector Summation time - " + elapsedTimeMillis);

	}
}
