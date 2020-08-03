
// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.util.Arrays;

/**
 * This class prompts the user for a set of coordinates, and then converts them
 * from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest {
	// Class methods *****************************************************

	/**
	 * This method is responsible for the creation of the PointCP object. This can
	 * be done in two ways; the first, by using the command line and running the
	 * program using <code> java 
	 * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
	 * </code> and the second by getting the program to prompt the user. If the user
	 * does not enter a valid sequence at the command line, the program will prompte
	 * him or her.
	 *
	 * @param args[0] The coordinate type. P for polar and C for cartesian.
	 * @param args[1] The value of X or RHO.
	 * @param args[2] The value of Y or THETA.
	 */
	public static void main(String[] args) {
		int size = 200;
		int size2 = 2000000;
		long[][] cp = new long[3][size];// cp[0][] = cp2 cp[1][] = cp3 cp[2][] = cp3
		int[] medianCP = new int[3];
		PointCP6 point;
		for (int i = 0; i < size; i++) {
			int x = (int) (Math.random() * 360);
			int y = (int) (Math.random() * 360);
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					point = new PointCP2(x, y);
				} else {
					if (j == 1) {
						point = new PointCP3(x, y);
					} else {
						point = new PointCP3(x, y);
						if ((point.getX() < 100 && point.getY() < 175) || (point.getY() < 100 && point.getX() < 175)) {
							point = new PointCP2(point.getX(), point.getY());
						}
					}
				}
				long start = System.currentTimeMillis();
				for (int k = 0; k < size2; k++) {
					test(point);
				}
				long elapsedTimeMillis = System.currentTimeMillis() - start;
				cp[j][i] = elapsedTimeMillis;
			}
		}
		for (int i = 0; i < 3; i++) {
			Arrays.sort(cp[i]);
			medianCP[i] = (cp[i].length) / 2;
			System.out.println("pour CP2 - min: " + cp[i][0] + " - max: " + cp[i][size - 1] + " - median: " + cp[i][(medianCP[i])]);
		}
	}

	private static void test(PointCP6 point) {
		point.getX();
		point.getY();
		point.getRho();
		point.getTheta();
		point.convertStorageToCartesian();
		point.convertStorageToPolar();
	}

}