package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Test;
/**
 * @author nada, toqa
 */
public class PJunit {
	/**
	 * test from pdf.
	 */
	@Test
	public void testSolveAdd() {
		Polynomial instance = new Polynomial();
		final int[][]terms = {{3, 7}, {45, 5}, {176, 3}, {128, 1} };
        instance.setPolynomial('C', terms);
        final int[][]terms2 = {{-120, 5}, {-1, 3}, {27, 2}, {1, 1},
            	{-1, 0} };
        instance.setPolynomial('B', terms2);
        int[][] result1 = instance.add('B', 'C');
        final int[][] expected = new int[][] {
                        {3, 7}, {-75, 5}, {175, 3},
                        {27, 2}, {129, 1}, {-1, 0}
                };
                assertArrayEquals(expected, result1);
}

/**
 * test set A,B,C.
 */
	@Test
	public void test() {
		Polynomial test = new Polynomial();
		final int[][]terms = {{-3, 0}, {1, 3}, {5, -2}};
		test.setPolynomial('C', terms);
		float result = test.evaluatePolynomial('C', 2);
		String s = Float.toString(result);
		String r = "6.25";
		assertEquals(r, s);
	}
/**
 * TEST ADD.
 */
	@Test
	public void test2() {
		Polynomial test = new Polynomial();
		final int[][]terms = {{-3, 0}, {1, 1}, {5, 2}};
		final int[][]terms2 = {{-3, 3}, {9, 4}, {5, 5}, {7, 8}};
		test.setPolynomial('C', terms);
		test.setPolynomial('A', terms2);
		final int[][]result = {
				{7, 8}, {5, 5}, {9, 4}, {-3, 3},
				{5, 2}, {1, 1}, {-3, 0}
				};
		int[][]actual = test.add('C', 'A');
		assertArrayEquals(result, actual);
		}
	/**
	 * TEST SUBTRACT.
	 */
	@Test
	public void test3() {
		Polynomial test = new Polynomial();
		final int[][]terms = {{-3, 0}, {1, 1}, {5, 2}};
		final int[][]terms2 = {{-3, 3}, {9, 2}, {5, 5}, {7, 8}};
		test.setPolynomial('A', terms);
		test.setPolynomial('B', terms2);
		final int[][]result = {
				{7, 8}, {5, 5}, {-3, 3}, {4, 2}, {-1, 1}, {3, 0}
				};
		int[][]actual = test.subtract('B', 'A');
		assertArrayEquals(result, actual);
		}
	/**
	 * test print.
	 */
		@Test
		public void test4() {
			Polynomial test = new Polynomial();
			final int[][]terms = {{-3, 0}, {1, 3}, {5, -2}};
			test.setPolynomial('A', terms);
			float result = test.evaluatePolynomial('A', 2);
			String s = Float.toString(result);
			String r = "6.25";
			assertEquals(r, s);
			String p = test.print('A');
			String r1 = "x^3-3+5x^-2";
			assertEquals(r1, p);
	}
		/**
		 * TEST multiply.
		 */
		@Test
		public void test5() {
			Polynomial test = new Polynomial();
			final int[][]terms = {{-3, 0}, {1, 1}, {5, 2}};
			final int[][]terms2 = {{-3, 0}, {1, 4}, {5, 2}};
			test.setPolynomial('C', terms);
			test.setPolynomial('A', terms2);
			int[][]actual = test.multiply('C', 'A');
			test.setPolynomial('R', actual);
			String p = test.print('R');
			String r1 = "5x^6+x^5+22x^4+5x^3-30x^2-3x+9";
			assertEquals(r1, p);
			}
		/**
		 * test from pdf.
		 */
		@Test
		public void testSolveAdd1() {
			Polynomial instance = new Polynomial();
			final int[][]terms = {
	            	{1, 7}, {-10, 6}, {40, 5}, {-96, 4},
	            	{176, 3 }, {-224, 2}, {128, 1}
	            	};
            instance.setPolynomial('C',
            // x^7-10x^6+40x^5-96x^4+176x^3-224x^2+128x
                           terms);
            final int[][]terms2 = {
                	{-120, 5}, {-146, 4}, {-1, 3}, {27, 2},
                	{1, 1}, {-1, 0}
                	};
            instance.setPolynomial('B',
               // -120x^5-146x^4-x^3+27x^2+x-1
                           terms2);
            assertNull("Polynomial R is not set yet",
            		instance.print('R'));
            int[][] result1 = instance.add('B', 'C');
            assertNotNull("Polynomial R must be set after evaluation",
            		instance.print('R'));
            try {
                    instance.add('B', 'Z');
                    fail("Operation on polynomial Z is not permitted");
            } catch (Exception e) {
            }
            int[][] result2 = instance.add('C', 'B');
            assertNotNull("Polynomial R must be set after evaluation",
            		instance.print('R'));
           final int[][] expected = new int[][] {
             // x^7-10x^6-80x^5-242x^4+175x^3-197x^2+129^x-1
                            {1, 7}, {-10, 6}, {-80, 5},
                            {-242, 4}, {175, 3}, {-197, 2},
                            {129, 1}, {-1, 0}
                    };
                    assertArrayEquals(expected, result1);
                    assertArrayEquals(expected, result2);
    }
}
