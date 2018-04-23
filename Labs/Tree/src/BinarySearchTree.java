public class BinarySearchTree<T extends Comparable<T>> {
    private static class Node<T> {
        public T value;
        public Node<T> left;
        public Node<T> right;
        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(T value) { this(value, null, null); }
    }
    private Node<T> root;

    public BinarySearchTree() { root = null; }

    private int sizeH(Node<T> cur) {
        if (cur == null) {
            return 0;
        } else {
            return 1 + sizeH(cur.left) + sizeH(cur.right);
        }
    }
    public int size() {
        return sizeH(root);
    }

    private Node<T> insertH(T v, Node<T> cur) {
        if (cur == null) {
            return new Node<>(v);
        } else {
            if (v.compareTo(cur.value) < 0) {
                cur.left = insertH(v, cur.left);
            } else {
                cur.right = insertH(v, cur.right);
            }
            return cur; }
    }
    public void insert(T v) {
        root = insertH(v, root);
    }

    private void inorderToStringH (Node<T> cur) {
        if (cur != null) {
            inorderToStringH(cur.left);
            System.out.println(cur.value);
            inorderToStringH(cur.right);
        }
    }

    public void inorderToString() {
        inorderToStringH(root);
    }

    private Node<T> searchH(T v, Node<T> cur, Node<T> shangjia) {
        if (cur == null) {
            return null;
        } else if (v.compareTo(cur.value) == 0){
            return shangjia;
        } else if (v.compareTo(cur.value) > 0) {
            shangjia = cur;
            return searchH(v, cur.right,shangjia);
        } else {
            shangjia = cur;
            return searchH(v, cur.left, shangjia);
        }
    }

    public Node<T> search(T v) {
        Node<T> shangjia = null;
        if (root == null) {
            return null;
        }
        if (v.compareTo(root.value) == 0) {
            return root;
        }
        if (root.right == null && root.left == null) {
            return null;
        }
        searchH(v, root, shangjia);
        return shangjia;
    }

    public boolean remove(T v) {
        Node<T> shangjia = search(v);

        //if v is not in the tree, return false
        if (shangjia == null) {
            return false;
        }

        //case: target is the end of the tree
        if (target.left == null && target.right == null) {
            target = null;
        }

        //case: target only has one child
         else {
            if (target.left == null)  {
                tar
            }
        }

        //find the next small one
        Node<T> tempP = target;
        Node<T> tempC = target.left;
        while (tempC.right != null) {
            tempP = tempC;
            tempC = tempC.right;
        }
    }

    public void main(String[] args) {

    }
}
