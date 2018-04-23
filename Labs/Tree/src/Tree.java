
public class Tree<T extends Comparable<T>> {
    private class Node<T> {
        public T value;
        public Node<T> left;
        public Node<T> right;

        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(T value) {
            this(value, null, null);
        }
    }

    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    private Node<T> insertHelper(T v, Node<T> current) {
        if (current == null) {
            return new Node<T>(v);
        } else {
            if (v.compareTo(current.value) < 0) {
                current.left = insertHelper(v, current.left);
            } else {
                current.right = insertHelper(v, current.right);
            }
            return current;
        }
    }

    public void insert(T v) {
        this.root = insertHelper(v, this.root);
    }

    private String preorder(Node<T> current) {
        if (current == null) {
            return "";
        } else {
            String str = current.value.toString() + " ";
            String left = preorder(current.left);
            String right = preorder(current.right);

            return str + left + right;
        }
    }

    public void preorderToString() {
        System.out.println(preorder(this.root));
    }

    private String inorder(Node<T> current) {
        if (current == null) {
            return "";
        } else {
            String str = current.value.toString() + " ";
            String left = inorder(current.left);
            String right = inorder(current.right);

            return left + str + right;
        }
    }

    public void inorderToString() {
        System.out.println(inorder(this.root));
    }

    private String postorder(Node<T> current) {
        if (current == null) {
            return "";
        } else {
            String str = current.value.toString() + " ";
            String left = postorder(current.left);
            String right = postorder(current.right);

            return left + right + str;
        }
    }

    public void postorderToString() {
        System.out.println(postorder(this.root));
    }

    private void leafRemove(T v, Node<T> parent) {
        if (parent.left != null && parent.left.value == v) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }

    private void oneChildRemove(T v, Node<T> parent) {
        if (parent.left != null && parent.left.value == v) {
            if (parent.left.left != null) {
                parent.left = parent.left.left;
            } else {
                parent.left = parent.left.right;
            }
        } else {
            if (parent.right.left != null) {
                parent.right = parent.right.left;
            } else {
                parent.right = parent.right.right;
            }
        }
    }

    public Node<T> findParent(T v, Node<T> current) {
        if (current == null) {
            return null;
            //what if the parent only have one node with v and null?
        } else if ((current.left != null && current.left.value == v) || (current.right != null && current.right.value == v)) {
            return current;
        } else {
            if (v.compareTo(current.value) < 0) {
                return findParent(v, current.left);
            } else {
                return findParent(v, current.right);
            }
        }
    }

    public void twoChildrenRemove(T v, Node<T> current) {
        Node<T> closestRight = current.right;

        while (closestRight.left.left != null) {
            closestRight = closestRight.left;
        }

        current.value = closestRight.left.value;

        oneChildRemove(closestRight.left.value, closestRight);
    }

    public boolean remove(T v) {
        Node<T> parent = findParent(v, this.root);

        if (parent == null) {
            if (this.root.value == v) {

                if (this.root.left == null && this.root.right == null) {
                    this.root = null;
                } else if ((this.root.left == null && this.root.right != null) || (this.root.left != null && this.root.right == null)) {
                    if (this.root.left != null) {
                        this.root = this.root.left;
                    } else {
                        this.root = this.root.right;
                    }
                } else {
                    twoChildrenRemove(v, this.root);
                }

                return true;
            } else {
                return false;
            }
        } else {
            Node<T> toRemove;
            if (parent.left != null && parent.left.value == v) {
                toRemove = parent.left;
            } else {
                toRemove = parent.right;
            }

            if (toRemove.left == null && toRemove.right == null) {
                leafRemove(v, parent);
            } else if ((toRemove.left == null && toRemove.right != null) || (toRemove.left != null && toRemove.right == null)) {
                oneChildRemove(v, parent);
            } else {
                twoChildrenRemove(v, toRemove);
            }

            return true;
        }
    }
}
