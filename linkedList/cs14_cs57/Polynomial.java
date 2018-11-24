package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;
import java.awt.Point;
import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;
/**
 * @author toka,nada.
 */
public class Polynomial implements IPolynomialSolver {
/**
 * list a, b,c.
 */
private DList a = new DList(), b = new DList(),
c = new DList(), r = new DList();
/**
 * check.
 */
private int flagCheck = 0;
/**
 * setPolynomial.
 */
	@Override
	public void setPolynomial(final char poly, int[][] terms) {
		// TODO Auto-generated method stub
		int i;
		terms = sort(terms);
		if (poly == 'A') {
			if (!a.isEmpty()) {
				a.clear();
			}
			for (i = 0; i < terms.length; i++) {
				a.add(new Point(terms[i][0], terms[i][1]));
			}
		} else if (poly == 'B') {
			if (!b.isEmpty()) {
				b.clear();
			}
			for (i = 0; i < terms.length; i++) {
				b.add(new Point(terms[i][0], terms[i][1]));
			}
		} else if (poly == 'C') {
			if (!c.isEmpty()) {
				c.clear();
			}
			for (i = 0; i < terms.length; i++) {
			c.add(new Point(terms[i][0], terms[i][1]));
		}
		} else if (poly == 'R') {
			if (!r.isEmpty()) {
				r.clear();
			}
			for (i = 0; i < terms.length; i++) {
			r.add(new Point(terms[i][0], terms[i][1]));
		}
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
/**
 * bubble sort.
 * @param terms
 * @return sort array
 */
	private int[][] sort(int[][] terms) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0; i < terms.length; i++) {
		for (j = 0; j < terms.length - 1 - i; j++) {
		if (terms[j][1] < terms[j + 1][1]) {
			terms = swap(terms, j, j + 1);
			}
		}
		}
		return terms;
		}
/**
 * swap 2 elements.
 * @param terms
 * @param j
 * @param i
 * @return swap for sort array
 */
	private int[][] swap(int[][] terms, final int j, final int i) {
		// TODO Auto-generated method stub
		int temp = terms[j][1];
		terms[j][1] = terms[i][1];
		terms[i][1] = temp;
		temp = terms[j][0];
		terms[j][0] = terms[i][0];
		terms[i][0] = temp;
		return terms;
	}
/**
 * print p.
 */
	@Override
	public String print(final char poly) {
		// TODO Auto-generated method stub
		DList l = new DList();
		if (poly == 'A') {
			l = a;
		} else if (poly == 'B') {
			l = b;
		} else if (poly == 'C') {
			l = c;
		} else if (poly == 'R') {
			l = r;
		} else {
			throw new IndexOutOfBoundsException();
		}
		if (l.isEmpty()) {
			return null;
		}
		String s = "";
		for (int i = 0; i < l.size(); i++) {
			Point p = (Point) l.get(i);
			int coef = (int) p.getX();
			int ex = (int) p.getY();
			if (s == "") {
				if (coef == 0) {
					s = "";
				} else if (ex == 0) {
					s = s + coef;
				} else if (ex == 1 && coef != 0
						&& coef != 1 && coef != -1) {
					s = coef + "x";
				} else if (coef == 1 && ex == 1) {
					s = "x";
				} else if (coef == 1) {
					s = "x^" + ex;
				} else if (coef == -1) {
					s = "-" + "x^" + ex;
				}  else {
					s = coef + "x^" + ex;
				}
			} else {
				if (ex == 0 && coef > 0) {
					s = s + "+" + coef;
				} else if (ex == 0 && coef < 0) {
					s = s + coef;
				} else if (ex == 1 && coef > 0 && coef != 1) {
					s = s + "+" + coef + "x";
				} else if (ex == 1 && coef < 0 && coef != -1) {
					s = s + coef + "x";
				} else if (coef == 1 && ex == 1) {
					s = s + "+" + "x";
				} else if (coef == -1 && ex == 1) {
					s = s + "-" + "x";
				} else if (coef == 1) {
					s = s + "+" + "x^" + ex;
				} else if (coef == -1) {
					s = s + "-" + "x^" + ex;
				} else if (coef < 0) {
					s = s + coef + "x^" + ex;
				} else if (coef > 0) {
					s = s + "+" + coef + "x^" + ex;
				}
			}
		}
		if (s.length() == 0) {
			return "0";
		}
		return s;
	}
/**
 * clear p.
 */
	@Override
	public void clearPolynomial(final char poly) {
		// TODO Auto-generated method stub
		if (poly == 'A' && !a.isEmpty()) {
			a.clear();
		} else if (poly == 'B' && !b.isEmpty()) {
			b.clear();
		} else if (poly == 'C' && !c.isEmpty()) {
			c.clear();
		} else if (poly == 'R' && !r.isEmpty()) {
			r.clear();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
/**
 * evaluate Polynomial.
 */
	@Override
	public float evaluatePolynomial(final char poly, final float value) {
		// TODO Auto-generated method stub
		int i = 1;
		DList l = new DList();
		Point p;
		float result = 0;
		if (poly == 'A') {
			l = a;
		} else if (poly == 'B') {
			l = b;
		} else if (poly == 'R') {
			l = r;
		} else if (poly == 'C') {
			l = c;
		} else {
			throw new IllegalArgumentException();
		}
		if (l.isEmpty()) {
			throw new IllegalArgumentException();
		}
			p = (Point) l.get(0);
			while (p != null) {
				if (p.y < 0 && value == 0) {
					throw new IllegalArgumentException();
				}
			result += p.x * java.lang.Math.pow(value, p.y);
			p = (Point) l.get(i);
			i++;
			}
			if (!r.isEmpty()) {
				r.clear();
			}
			r.add(result);
		return result;
	}
/**
 * add two p.
 */
	@Override
	public int[][] add(final char poly1, final char poly2) {
		// TODO Auto-generated method stub
		if (flagCheck == 1) {
			r.clear();
		}
		int i = 0, j = 0, z = 0;
		Point p1, p2, p3;
		DList first = new DList(), second = new DList();
		if ((poly1 == 'A' && poly2 == 'B')
				|| (poly1 == 'B' && poly2 == 'A')) {
		first = a;
		second = b;
		} else if (poly1 == 'B' && poly2 == 'C'
				|| (poly1 == 'C' && poly2 == 'B')) {
			first = c;
			second = b;
		} else if (poly1 == 'A' && poly2 == 'C'
				|| (poly1 == 'C' && poly2 == 'A')) {
			first = c;
			second = a;
		}  else if (poly1 == 'A' && poly2 == 'A') {
			first = a;
			second = a;
		} else if (poly1 == 'C' && poly2 == 'C') {
			first = c;
			second = c;
		} else if (poly1 == 'B' && poly2 == 'B') {
			first = b;
			second = b;
		} else {
			throw new IndexOutOfBoundsException();
		}
		if (first.isEmpty() || second.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		p1 = (Point) first.get(i);
		p2 = (Point) second.get(j);
		while (p1 != null && p2 != null) {
			if (p2.x == 0 && p1.x == 0) {
				j++;
				i++;
			} else if (p1.x == 0) {
				i++;
			} else if (p2.x == 0) {
				j++;
			} else if (p1.y > p2.y) {
			r.add(p1);
			i++;
			} else if (p1.y == p2.y) {
			p3 = new Point(p1.x + p2.x, p1.y);
			r.add(p3);
			i++;
			j++;
			} else {
			r.add(p2);
			j++;
			}
		z++;
		p1 = (Point) first.get(i);
		p2 = (Point) second.get(j);
		}
		while (p1 != null) {
		r.add(p1);
		p1 = (Point) first.get(++i);
		z++;
		}
		while (p2 != null) {
			r.add(p2);
			p2 = (Point) second.get(++j);
			z++;
			}
		int[][] result = new int[z][2];
		for (i = 0; i < z; i++) {
			p3 = (Point) r.get(i);
			result[i][0] = p3.x;
			result[i][1] = p3.y;
		}
		flagCheck = 1;
		return result;
	}
/**
 * subtract two p.
 */
	@Override
	public int[][] subtract(final char poly1, final char poly2) {
		if (flagCheck == 1) {
			r.clear();
		}
		int i = 0, j = 0, z = 0;
		Point p1, p2, p3;
		DList first = new DList(), second = new DList();
		if (poly1 == 'A' && poly2 == 'B') {
		first = a;
		second = b;
		} else if (poly1 == 'B' && poly2 == 'A') {
			first = b;
			second = a;
		} else if (poly1 == 'B' && poly2 == 'C') {
			first = b;
			second = c;
		} else if (poly1 == 'C' && poly2 == 'B') {
			first = c;
			second = b;
		} else if (poly1 == 'C' && poly2 == 'A') {
			first = c;
			second = a;
		} else if (poly1 == 'A' && poly2 == 'B') {
			first = a;
			second = b;
		} else if (poly1 == 'A' && poly2 == 'C') {
			first = a;
			second = c;
		}  else if (poly1 == 'A' && poly2 == 'A') {
			first = a;
			second = a;
		} else if (poly1 == 'C' && poly2 == 'C') {
			first = c;
			second = c;
		} else if (poly1 == 'B' && poly2 == 'B') {
			first = b;
			second = b;
		} else {
			throw new IndexOutOfBoundsException();
		}
		if (first.isEmpty() || second.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		p1 = (Point) first.get(i);
		p2 = (Point) second.get(j);
		while (p1 != null && p2 != null) {
		if (p1.y > p2.y) {
			r.add(p1);
			i++;
		} else if (p1.y == p2.y) {
			if (p1.x == p2.x) {
				i++;
				j++;
				z--;
			} else {
			p3 = new Point(p1.x - p2.x, p1.y);
			r.add(p3);
			i++;
			j++;
			}
		} else {
			p3 = new Point(-1 * p2.x, p2.y);
			r.add(p3);
			j++;
		}
		z++;
		p1 = (Point) first.get(i);
		p2 = (Point) second.get(j);
		}
		while (p1 != null) {
		r.add(p1);
		p1 = (Point) first.get(++i);
		z++;
		}
		while (p2 != null) {
			p2.x = -1 * p2.x;
			r.add(p2);
			p2 = (Point) second.get(++j);
			z++;
			}
		if (z == 0) {
			int[][] result = {{0, 0}};
			p3 = new Point(0, 0);
			r.add(p3);
			return result;
		}
		int[][] result = new int[z][2];
		for (i = 0; i < z; i++) {
			p3 = (Point) r.get(i);
			result[i][0] = p3.x;
			result[i][1] = p3.y;
		}
		flagCheck = 1;
		return result;
	}
/**
 * multiply two p.
 */
	@Override
	public int[][] multiply(final char poly1, final char poly2) {
		// TODO Auto-generated method stub
		if (flagCheck == 1) {
			r.clear();
		}
		DList allR = new DList();
		DList afR = new DList();
		DList first = new DList(), second = new DList();
		Point p1, p2, p3 = null;
		int i, j, z = 0;
		if ((poly1 == 'A' && poly2 == 'B')
				|| (poly1 == 'B' && poly2 == 'A')) {
		first = a;
		second = b;
		} else if (poly1 == 'B' && poly2 == 'C'
				|| (poly1 == 'C' && poly2 == 'B')) {
			first = c;
			second = b;
		} else if (poly1 == 'A' && poly2 == 'C'
				|| (poly1 == 'C' && poly2 == 'A')) {
			first = c;
			second = a;
		} else if (poly1 == 'A' && poly2 == 'A') {
			first = a;
			second = a;
		} else if (poly1 == 'C' && poly2 == 'C') {
			first = c;
			second = c;
		} else if (poly1 == 'B' && poly2 == 'B') {
			first = b;
			second = b;
		} else {
			throw new IndexOutOfBoundsException();
		}
		if (first.isEmpty() || second.isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		for (i = 0; i < first.size(); i++) {
			p1 = (Point) first.get(i);
			for (j = 0; j < second.size(); j++) {
				p2 = (Point) second.get(j);
				p3 = new Point(p1.x * p2.x, p1.y + p2.y);
				allR.add(p3);
				z++;
			}
		}
		int k1 = z;
		int[] flag = new int[z];
		for (int h = 0; h < z; h++) {
			flag[h] = 0;
		}
		for (i = 0; i < z; i++) {
			int flage = 0;
			p1 = (Point) allR.get(i);
			for (j = i + 1; j < z; j++) {
			p2 = (Point) allR.get(j);
			if (p1.y == p2.y) {
					p3 = new Point(p1.x + p2.x, p1.y);
					afR.add(p3);
					k1--;
					flage = 1;
					flag[j] = 1;
					}
			}
			if (flage == 0 && flag[i] == 0) {
				p3 = new Point(p1.x, p1.y);
				afR.add(p3);
			}
		}
		if (k1 <= 0) {
			k1 = afR.size();
		}
		int[][] result = new int[k1][2];
		for (i = 0; i < k1; i++) {
			p3 = (Point) afR.get(i);
			result[i][0] = p3.x;
			result[i][1] = p3.y;
		}
		result = sort(result);
		for (i = 0; i < k1; i++) {
			p3 = new Point(result[i][0], result[i][1]);
			r.add(p3);
		}
		flagCheck = 1;
		return result;
	}

}
