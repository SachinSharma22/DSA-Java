public class SameTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isSameTree(Node p, Node q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return (
            (p.data == q.data) &&
            (isSameTree(p.left, q.left))&&
            (isSameTree(p.right, q.right))
        );
    }
    public static void main(String[] args) {
        //First tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        System.out.println(isSameTree(root1, root2));
    }
}