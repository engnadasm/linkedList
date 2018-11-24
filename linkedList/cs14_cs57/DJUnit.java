package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * @author nada, toqa
 */
public class DJUnit {
	 /**
     * given test.
     */
    @Test
    public void cs65TestSet() {
    	DList instance = new DList();
        final int i = 3;
        instance.add(1);
        instance.add(i);
        instance.add(1);
        instance.add(1);
        instance.remove(0);
        instance.remove(0);
        instance.remove(0);
        instance.remove(0);
        instance.add(1);
        assertEquals(1, instance.get(0));
    }
	/**
	 * Test the correct insertion of nodes.
	 */
	@Test
	public void cs52TestSetAndRemove() {
        DList object =  new DList();
        object.add(0, 0);
        object.add(1, 1); // line 365
        object.add(2, 2);
        object.remove(1);
        assertEquals(object.get(1), 2);
    }
	/**
	 * Initialize the linked list to point to your
	 * implementation and add some nodes to the list.
	 */
	@Test
	public void test1() {
		DList object = new DList();
	    object.add(0, 0);
        object.add(1, 1);
        object.add(2, 2);
        object.remove(0);
        assertEquals(object.get(1), 2);
	}
	/**
	 * Test the correct insertion of nodes.
	 */
	@Test
	public void test2() {
		DList object = new DList();
		for (int i = 0; i <= 2; ++i) {
			object.add(i);
		}
		for (int i = 0; i <= 2; ++i) {
		 assertEquals(object.get(i), i);
		}
	}
	/**
	 * test that the node is added at the correct index.
	 */
	@Test
	public void test4() {
		DList object = new DList();
		object.add(1);
		object.add(2);
		object.add(0);
		object.add(1);
		object.add(2, 1);
		assertEquals(object.get(2), 1);
	}
	/**
	 * Test set() method.
	 */
	@Test
	public void test5() {
		DList object = new DList();
		object.add(1);
		object.add(2);
		object.add(0);
		object.set(1, 0);
		assertEquals(object.get(1), 0);
		}
	/**
	 * Assure that the size of the sublist is
	 * correct and the elements are the desired ones.
	 */
	@Test
	public void test6() {
		DList object = new DList();
	    object.add(0);
        object.add(1);
        object.add(0);
        object.add(2);
        object.add(1);
        object.add(0);
		DList sub = new DList();
		final int i = 4;
        sub = (DList) object.sublist(2, i);
		final int j = 3;
        assertEquals(sub.size(), j);
        assertEquals(sub.get(0), 0);
        assertEquals(sub.get(1), 2);
        assertEquals(sub.get(2), 1);
	}
	/**
	 * Remove one node from the list and assert that
	 *  the size of the list has been decreased and
     * that the node has been deleted properly.
	 */
	@Test
	public void test7() {
		DList object = new DList();
	    object.add(0);
        object.add(1);
        object.add(2);
        object.add(1);
        object.remove(2);
		final int j = 3;
        assertEquals(object.size(), j);
        assertEquals(object.get(2), 1);
        assertEquals(object.contains(j), false);
	}
	/**
	 * Test the contains() method by calling the method
	 * with integer that is in the list.
	 */
	@Test
	public void test8() {
		DList object = new DList();
	    object.add(2);
        object.add(1);
        object.add(0);
        object.add(1);
        assertEquals(object.contains(2), true);
	}
	/**
	 * Test the contains() method by calling the method
	 * with integer that is not in the list.
	 */
	@Test
	public void test9() {
		DList object = new DList();
	    object.add(1);
        object.add(2);
        object.add(2);
        object.add(0);
		final int j = 3;
        assertEquals(object.contains(j), false);
	}
	/**
	 * Clear the elements of the list.Assure that the list is Empty.
	 */
	@Test
	public void test10() {
		DList object = new DList();
	    object.add(1);
        object.add(2);
        object.add(0);
        object.add(1);
        object.clear();
        assertEquals(object.size(), 0);
        assertEquals(object.isEmpty(), true);
	}
}
