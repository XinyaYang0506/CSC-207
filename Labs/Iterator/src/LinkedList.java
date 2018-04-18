
public class LinkedList<T> {
	private class Node<T>{
		T value;
		Node<T> next;
		
		
		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
			
		}
	}
	
	Node<T> firstNode;
	int size;

	public LinkedList(T value) {
		firstNode = new Node<T>(value, null);
		this.size = 1;
	}

	public boolean add(T value, int index) {
		if (index < size) {
			Node<T> cur = firstNode;
			for (int i = 0; i < index; i++) {
				cur = cur.next; 
			}
			Node<T> newNode = new Node(value, cur.next);
			cur.next = newNode;
			return true; 
		} else return false;
	}
}

