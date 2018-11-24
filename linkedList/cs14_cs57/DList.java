package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;
import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;
/**
 * @author nada,toqa
 */
public class DList implements ILinkedList {
/**
 * size.
*/
private int size;
/**
 * header , tailer.
 */
private DNode header, tailer;
/**
 * constructor that creates an empty list.
 */
public DList() {
	size = 0;
	header = new DNode(null, null, null);
	tailer = new DNode(null, null, header);
	header.setNext(tailer);
}
/**
 * add element.
*/
	@Override
	public void add(final int index, final Object element) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
			}
		int count = 0;
		DNode n = header.getnext(), p = header;
		while (count < index) {
		p = p.getnext();
		n = n.getnext();
		count++;
		}
		DNode e = new DNode(element, n, p);
		n.setPrev(e);
		p.setNext(e);
		size++;
	}
	/**
	 * add element.
	 */
	@Override
	public void add(final Object element) {
		// TODO Auto-generated method stub
		DNode p = tailer.getPrevious();
		DNode e = new DNode(element, tailer, p);
		tailer.setPrev(e);
		p.setNext(e);
		size++;
	}
	/**
	 * get element of this index.
	 */
	@Override
	public Object get(final int index) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
			}
		DNode v = header.getnext();
		int count = 0;
		while (count < index) {
			count++;
			v = v.getnext();
		}
		return v.getElement();
	}
	/**
	 * set new element.
	 */
	@Override
	public void set(final int index, final Object element) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0) {
		throw new IndexOutOfBoundsException();
		}
		DNode v = header.getnext();
		int count = 0;
		while (count < index) {
			count++;
			v = v.getnext();
		}
		v.setElement(element);
	}
	/**
	 * delete element.
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		header.setNext(tailer);
		tailer.setPrev(header);
		size = 0;
	}
	/**
	 * check if SList is empty.
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}
	/**
	 * delete element with this index.
	 */
	@Override
	public void remove(final int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
			}
		size--;
		int count = 0;
		DNode n = header.getnext(), p = header;
		DNode v = header.getnext();
		while (count < index) {
		p = p.getnext();
		v = v.getnext();
		n = n.getnext();
		count++;
		}
		n = n.getnext();
		p.setNext(n);
		n.setPrev(p);
		v.setNext(null);
		v.setPrev(null);
	}
	/**
	 * return size.
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	/**
	 * take sub Set of list.
	 */
	@Override
	public ILinkedList sublist(final int fromIndex, final int toIndex) {
		// TODO Auto-generated method stub
		if (fromIndex < 0 || toIndex >= size) {
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		int num = toIndex - fromIndex + 1;
		DNode current = header.getnext();
		while (count < fromIndex) {
			current = current.getnext();
			count++;
		}
		count = 0;
		DList newList = new DList();
		while (count < num) {
			newList.add(current.getElement());
			current = current.getnext();
			count++;
		}
		return newList;
	}
	/**
	 * check if list contain this element.
	 */
	@Override
	public boolean contains(final Object o) {
		// TODO Auto-generated method stub
		int count = 0;
		DNode v = header.getnext();
		while (count < size) {
			if (v.getElement().equals(o)) {
				return true;
			}
			v = v.getnext();
			count++;
		}
		return false;
	}
}
