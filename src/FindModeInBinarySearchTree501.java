/*
* Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
For example:
Given BST [1,null,2,2],
   1
    \
     2
    /
   2
return [2].

Note: If a tree has more than one mode, you can return them in any order.*/

import java.util.*;

public class FindModeInBinarySearchTree501 {

    HashMap<Integer,Integer> count = new HashMap<>();

    public int[] findMode(TreeNode root) {

        if(root == null) return new int[0];


        inorderMode(root);

        int val = Collections.max(count.values());

        List<Integer> ll= new LinkedList<>();

        for(Integer key : count.keySet()){
            if(count.get(key)==val)ll.add(key);
        }

        return ll.stream().mapToInt(i->i).toArray();

    }

    public void inorderMode(TreeNode root){

        if(root!=null){
            count.put(root.val,count.getOrDefault(root.val,0)+1);
            inorderMode(root.left);
            inorderMode(root.right);
        }

    }

}
