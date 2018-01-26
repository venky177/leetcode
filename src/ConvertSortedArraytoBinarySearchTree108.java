public class ConvertSortedArraytoBinarySearchTree108 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedArrayToBST(int[] nums) {


        return buildTreefromArray(nums,0,nums.length-1);

    }

    public TreeNode buildTreefromArray(int[] nums,int l,int r){

        if(l<=r){

            int mid = l/2+r/2;
            TreeNode head = new TreeNode(nums[mid]);
            head.left = buildTreefromArray(nums,l,mid-1);
            head.right = buildTreefromArray(nums,mid+1,r);

            return head;
        }
        return null;

    }

    public static void main(String args[]){

        ConvertSortedArraytoBinarySearchTree108 cc = new ConvertSortedArraytoBinarySearchTree108();
        int nums[] = {1,2,3,4,5,6,7};
        TreeNode n = cc.sortedArrayToBST(nums);
        System.out.println(n.val);

    }



}
