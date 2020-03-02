public class Tree {
    private Node root;

    public Tree() {

    }

    public void insert(Node node) {
        if (root == null) {
            root = node;
        } else {
            innerInsert(root, node);
        }
    }

    public boolean isBalanced() {
        return innerBalanced(root) != -1;
    }

    private int innerBalanced(Node node) {
        int lHeight = 0, rHeight = 0;
        if (node.getLeft() != null) {
            lHeight = innerBalanced(node.getLeft());
        }
        if (node.getRight() != null) {
            rHeight = innerBalanced(node.getRight());
        }

        if (Math.abs(lHeight -  rHeight) <= 1 && lHeight != -1 && rHeight != -1) {
            return Math.max(lHeight, rHeight) + 1;
        } else {
            return -1;
        }
    }

    private void innerInsert(Node start, Node node) {
        if (node.getValue() > start.getValue()) {
            if (start.getRight() == null) {
                start.setRight(node);
            } else {
                innerInsert(start.getRight(), node);
            }
        } else {
            if (start.getLeft() == null) {
                start.setLeft(node);
            } else {
                innerInsert(start.getLeft(), node);
            }
        }
    }

}
