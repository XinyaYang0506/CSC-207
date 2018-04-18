import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator<T> implements Iterator<T> {

	LinkedList<T> list;
	int index;
	int size;

	public LinkedListIterator(LinkedList<T> list) {
		this.list = list;
		index = 0;
		size = list.size();
	}

	@Override
	public boolean hasNext() {
		if (index >= size) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public T next() {
		return list.get(++index);
	}

}
