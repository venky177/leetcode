import java.util.LinkedList;
import java.util.List;

/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
public class BinaryTreePaths257 {

    List<String> list= new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {

inorderWithPath(root,"");
return list;
    }

    public void inorderWithPath(TreeNode root, String path){
        if(root==null)return;

        if(root.left == null && root.right==null){
            path+="->"+root.val;
            path = path.substring(2);
            list.add(path);
            return;
        }
        path+="->"+root.val;
        inorderWithPath(root.left,path);
        inorderWithPath(root.right,path);
    }

    public void caller(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        binaryTreePaths(root);
    }

    public static void main(String args[]) {

        BinaryTreePaths257 bb= new BinaryTreePaths257();

        bb.caller();
    }

}
