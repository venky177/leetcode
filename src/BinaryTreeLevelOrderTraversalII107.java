import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]*/
public class BinaryTreeLevelOrderTraversalII107 {

    List<List<Integer>> levels = new LinkedList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root){
        inorderWithDepth(root,0);

        Collections.reverse(levels);

        return levels;

    }

    public void inorderWithDepth(TreeNode root,int depth){

        if(root!=null){

            if(depth >= levels.size()){
                levels.add(new LinkedList<>());
            }

            levels.get(depth).add(root.val);

            inorderWithDepth(root.left,depth+1);

            inorderWithDepth(root.right,depth+1);
        }
    }

    public void caller(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        levelOrderBottom(root);
    }

    public static void main(String args[]) {

        BinaryTreeLevelOrderTraversalII107 bb= new BinaryTreeLevelOrderTraversalII107();

        bb.caller();
    }


    }
