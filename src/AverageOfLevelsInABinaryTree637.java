import java.util.LinkedList;
import java.util.List;

/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.
 */
public class AverageOfLevelsInABinaryTree637 {

    double box[] = new double[100000];
    int count[] = new int[100000];

    public List<Double> averageOfLevels(TreeNode root) {
        inorderWithDepth(root,0);

        int i=0;

        List<Double> list= new LinkedList<>();

        while (count[i]!=0){
            list.add(box[i]/count[i]);
            i++;
        }

        return list;

    }

    public void inorderWithDepth(TreeNode root,int depth){

        if(root!=null){
            inorderWithDepth(root.left,depth+1);
            box[depth]+=root.val;
            count[depth]++;
            inorderWithDepth(root.right,depth+1);
        }
    }

}
