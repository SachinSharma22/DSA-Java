public class HeightOfTree {
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

    //height of the tree was calculated with the help of nodes not branches
    public static int heightOfTree(Node root ) {
        if(root == null ){
            return 0;
        }
        //lh -> left height, rh -> right height
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int lc = countOfNodes(root.left);
        int rc = countOfNodes(root.right);
         return lc + rc + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        //This calculates height of the tree
        // System.out.println(heightOfTree(root));

        // This calculates total number of nodes in the tree
        System.out.println(countOfNodes(root));
    }
}