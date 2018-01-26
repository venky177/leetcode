import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfABinaryTree111 {

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left==0)
            return right+1;
        if(right==0)
            return left+1;
        return left<right ? left+1:right+1;
    }

}
