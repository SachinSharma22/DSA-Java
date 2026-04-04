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

    //count number of nodes in the tree
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int lc = countOfNodes(root.left);
        int rc = countOfNodes(root.right);
         return lc + rc + 1;
    }

    // calculate total of nodes value in the tree
    public static int totalValues(Node root) {
        if(root == null) {
            return 0;
        }

        int leftTotal = totalValues(root.left);
        int rightTotal = totalValues(root.right);

        return leftTotal + rightTotal + root.data;
    }

    // Diameter of the tree
    public static int diameter2(Node root ) {
        if(root == null) {
            return 0;
        }
        int leftDia = diameter2(root.left);
        int leftHt = heightOfTree(root.left);
        int rightDia = diameter2(root.right);
        int rightHt = heightOfTree(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDia, rightDia));
    }

    //Optimized way to find diameter
    public static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if(root == null ){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }


    //is Subtree

    public static boolean isIdentical(Node node,Node subNode) {
        if(node == null && subNode == null) {
            return true;
        }else if(node == null || subNode == null || node.data != subNode.data) {
            return false;
        }

        if(!isIdentical(node.left, subNode.left)) {
            return false;
        }
        if(!isIdentical(node.right, subNode.right)) {
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
           if(isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static int findMaxNode(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = findMaxNode(root.left);
        int rightMax = findMaxNode(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
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
        // System.out.println(countOfNodes(root));

        //This calculate the sum of total nodes
        // System.out.println(totalValues(root));

        //Diameter of tree
        // System.out.println(diameter(root));

        //Diameter with linear time complexity
        // System.out.println(diameter(root).diam);

        //find max of the sub tree
        System.out.println(findMaxNode(root));

        //sub tree
        // Node subNode = new Node(2);
        // subNode.left = new Node(4);
        // subNode.right = new Node(5);

        // System.out.println(isSubtree(root, subNode));
    }
}