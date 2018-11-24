package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;
import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;
/**
 * @author nada,toqa
 */
public class SList implements ILinkedList {
/**
 * size.
*/
private int size;
/**
 * header , tailer.
 */
private SNode header, tailer;
/**
 * constructor that creates an empty list.
 */
public SList() {
	size = 0;
	header = new SNode(null, null);
	tailer = new SNode(null, null);
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
	SNode current = header;
	SNode per = current.getnext();
	while (count < index) {
	current = current.getnext();
	per = current.getnext();
	count++;
	}
	SNode select = new SNode(element, per);
	current.setNext(select);
	size++;
}
/**
 * add element.
 */
@Override
public void add(final Object element) {
	// TODO Auto-generated method stub
	int i = 0;
	SNode current = header;
	SNode e = new SNode(element, null);
	while (i < size) {
		current = current.getnext();
	    i++;
	}
	current.setNext(e);
	e.setNext(tailer);
	size++;
}
/**
 * get element of this index.
 */
@Override
public Object get(final int index) {
	// TODO Auto-generated method stub
	if (index >= size || index < 0) {
		throw new IndexOutOfBoundsException();
	}
	SNode select = header.getnext();
	int count = 0;
	while (count < index) {
		count++;
		select = select.getnext();
	}
	return select.getElement();
}
/**
 * set new element.
 */
@Override
public void set(final int index, final Object element) {
	// TODO Auto-generated method stub
	if (index > size || index < 0) {
		throw new IndexOutOfBoundsException();
	}
	SNode select = header.getnext();
	int count = 0;
	while (count < index) {
		count++;
		select = select.getnext();
	}
	select.setElement(element);
}
/**
 * delete element.
 */
@Override
public void clear() {
	// TODO Auto-generated method stub
	header.setNext(tailer);
	size = 0;
}
/**
 * check if SList is empty.
 */
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return size == 0;
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
	int count = 0;
	SNode current = header;
	SNode select = header.getnext();
	while (count < index) {
	current = current.getnext();
	select = select.getnext();
	count++;
	}
	current.setNext(select.getnext());
	select.setNext(null);
	size--;
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
public ILinkedList sublist(final int fromIndex,
	final int toIndex) {
	// TODO Auto-generated method stub
	if (fromIndex < 0 || toIndex >= size) {
		throw new IndexOutOfBoundsException();
	}
	int count = 0;
	int num = toIndex - fromIndex + 1;
	SNode current = header.getnext();
	while (count < fromIndex) {
		current = current.getnext();
		count++;
	}
	count = 0;
	SList newList = new SList();
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
public boolean contains(final Object check) {
	// TODO Auto-generated method stub
	int count = 0;
	SNode current = header.getnext();
	while (count < size) {
		if (current.getElement().equals(check)) {
			return true;
		}
		current = current.getnext();
		count++;
	}
	return false;
}
/**
 * print the list.
 * @return string
 */
public String print() {
	String result = "";
	SNode current = header;
	while (current.getnext() != null) {
		current = current.getnext();
		result = result + current.getElement() + ", ";
	}
	return "List: " + result;
}
}
