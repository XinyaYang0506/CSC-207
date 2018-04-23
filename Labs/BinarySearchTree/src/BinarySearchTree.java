import java.awt.List;
import java.util.LinkedList;

public class BinarySearchTree<T extends Comparable<T>> {

	private static class Node<T extends Comparable<T>>  {
		public T value; 
		public Node<T> left; 
		public Node<T> right; 
		public Node (T value, Node<T> left, Node<T> right) {
			this.value = value; 
			this.left = left; 
			this.right = right;
		}

		public Node(T value) {
			this(value, null, null);
		}
	}

	private Node<T> root;


	public BinarySearchTree() {
		root = null; 
	}
	
	private int sizeH(Node<T> cur) {
		if (cur == null) {
			return 0;
		} else {
			return 1+sizeH(cur.left) + sizeH (cur.right);
		}
	}

	
	public int size() {
		return sizeH(root);
	}

	private <T extends Comparable<T>> Node<T> insertH(T v,Node<T> cur) {
		if (cur == null) {
			return new Node<T>(v);
		} else {
			if ( v.compareTo(cur.value) < 0) {
				cur.left = insertH(v, cur.left);
			} else {
				cur.right = insertH(v, cur.right);
			}
			return cur;
		}
	}
	
	public void insert (T v) {
		root = insertH(v, root); 
	}
	
	public static void main(String[] args) {
		BinarySearchTree Tree1 = new BinarySearchTree();
		System.out.println(Tree1.size());
		Tree1.insert(2);
		System.out.println(Tree1.size());
		Tree1.insert(2);
		System.out.println(Tree1.size());
	}
	
}
