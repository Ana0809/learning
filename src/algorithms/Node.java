package algorithms;

public class Node {
    public Object data;
    private Node left, right;
    public Node(Object data,Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public Object getData() {
        return data;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }

}
