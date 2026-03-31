public class PreorderBinaryTree {
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

    static class BinrayTree {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Preorder traversal
        public void preorder(Node root) {
            if(root == null ) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }

        //inorder traversal
        public void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        //post order traversal

        public void postOrder(Node root) {
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinrayTree tree = new BinrayTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // preorder print
        // tree.preorder(root);

        //Inorder traversal
        // tree.inorder(root);

        // Postorder traversal

        tree.postOrder(root);
    }
}