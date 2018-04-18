/**
 * 
 * @author yangxiny
 *
 */
public class LinkedList {
	Node first;
	
	public LinkedList() {
		first = null;
	}
	
	public void push(int e) {
		Node t = new Node(e);
		t.next = first;
		first = t;
		
	}
	
	public String toStringM() {
		String result = "[";
		Node cur = first;
		while (cur != null) {
		result += cur.value + ", "; 
	}
		result+="]";
		return result;
	}
}
