package Praktikum;

class Node {
    String data;
    Node left, right;

    public Node(String item) {
        data = item;
        left = right = null;
    }
}

public class TreeTraversal {
    Node root;

    public TreeTraversal() {
        root = null;
    }

    void insert(String data) {
        root = insertRec(root, new Node(data));
    }

    Node insertRec(Node root, Node data) {
        if (root == null) {
            root = data;
            return root;
        }

        if (data.data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        }else if (data.data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
	   }
	}
}