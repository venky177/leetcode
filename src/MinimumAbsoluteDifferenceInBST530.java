import java.util.LinkedHashSet;
import java.util.Set;

/*
* Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

Example:

Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
Note: There are at least two nodes in this BST.

*/
public class MinimumAbsoluteDifferenceInBST530 {

    Set<Integer> store= new LinkedHashSet<>();

    public int getMinimumDifference(TreeNode root) {

        inorder(root);

        int min = Integer.MAX_VALUE;

        Integer[] array = store.toArray(new Integer[store.size()]);



        for(int i=1;i<array.length;i++){

        if((array[i]-array[i-1])<min){
            min = array[i]-array[i-1];
        }

        }


        return min;

    }

    public void inorder(TreeNode root){

        if(root!=null){
            inorder(root.left);
            store.add(root.val);
            inorder(root.right);
        }
    }


}
