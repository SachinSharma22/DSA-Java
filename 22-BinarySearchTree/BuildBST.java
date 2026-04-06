public class BuildBST {
    static class Node {
        int data;
        Node left;
        Node right;  
        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if(root == null ) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder( Node root) {
        if(root == null ) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //search in binary search tree
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    //delete
    public static Node delete(Node root, int key) {
        if(root.data < key) {
            root.right = delete(root.right, key);
        }else if(root.data > key) {
            root.left = delete(root.left, key);
        }else{//voila case
            //case 1-> Leaf node
            if(root.left == null && root.right == null) {
                return null;
            }
            //case 2 -> single node
            if(root.left == null ) {
                return root.right;
            }else if (root.right == null ) {
                return root.left;
            }
            //Both childrens are available -> Find InorderSuccessor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        //delete node
        delete(root, 5);
        inorder(root);

        // //search
        // if(search(root, 11)){
        //     System.out.println("FOUND");
        // }else{
        //     System.out.println("NOT FOUND");
        // }
    }
}