package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;
/**
 * @author toka,nada
 */
public class DNode {
/**
 * element.
 */
private Object element;
 /**
  * pointer to next and previous nodes.
  */
private DNode next, prev;
/**
 * Constructor that creates a node with given fields.
 * @param e is data of element
 * @param n is the next node
 * @param p is the perv node
 */
public DNode(final Object e, final DNode n, final DNode p) {
	element = e;
	next = n;
	prev = p;
}
/**
 * Returns the element of this node.
 * @return the data of element
 */
public Object getElement() {
	return element;
}
/**
 * Returns the prev node of this node.
 * @return the prev node
 */
public DNode getPrevious() {
	return prev;
}
/**
 * Returns the next node of this node.
 * @return the next node
 */
public DNode getnext() {
	return next;
}
/**
 * sets the element of this node.
 * @param e is data of element
 */
public void setElement(final Object e) {
	element = e;
}
/**
 * sets the previous node of this node.
 * @param p is data of element
 */
public void setPrev(final DNode p) {
	prev = p;
}
/**
 * sets the next node of this node.
 * @param n is the next node
 */
public void setNext(final DNode n) {
	next = n;
}
}
