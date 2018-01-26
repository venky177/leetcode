public class Tree {

    Node root;

    public void buildTree(){

        root = new Node(1);
        Node l = new Node(2);

        Node r = new Node(3);

        Node ll = new Node(4);

        Node lr = new Node(5);

        Node rl = new Node(6);

        Node rr = new Node(7);

        root.left=l;
        root.right=r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        //Node l = new Node(2);

        //Node l = new Node(2);

    }

    public void inorder(Node root){

        if(root!=null){
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    public void buildMirror(Node root){
        if(root!=null){
            buildMirror(root.left);
            buildMirror(root.right);

            //Swap left and right
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

        }
    }

    public static void main(String args[]){

        Tree t = new Tree();
        Tree t2 = new Tree();
        t.buildTree();
        t2.buildTree();
        t.inorder(t.root);
        t.buildMirror(t.root);
        t.inorder(t.root);
        t.buildMirror(t.root);

        System.out.println(areIdenticalTrees(t.root,t2.root));


    }

    public static boolean areIdenticalTrees(Node root1, Node root2) {
        // If both the tree nodes are null, then both are identical
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 != null && root2 != null) {
            // Check if the 2 nodes have same data and recursively check if left and right subtrees are identical
            return ((root1.getVal() == root2.getVal() &&
                    (areIdenticalTrees(root1.getLeft(), root2.getLeft()) &&
                            (areIdenticalTrees(root1.getRight(), root2.getRight())))));


        }
        // If either of root1 or root2 is null but not both, then the trees are not identical
        return false;
    }

    class Node{

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
