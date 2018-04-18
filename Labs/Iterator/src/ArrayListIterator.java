import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {
	ArrayList<T> list;
	T curNode;
	int index;
	int size;

	public ArrayListIterator(ArrayList<T> list) {
		this.list = list;
		curNode = list.get(0);
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
		curNode = list.get(++index);
		return curNode;
	}

}
