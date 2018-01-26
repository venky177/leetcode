/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */
public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }


    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};

        int k = 3;

        int start = 0;
        int jumpto = (start+k)%arr.length;
        int tempholder = arr[start];
        for(int i=0;i<arr.length/2;i++){

            tempholder = arr[jumpto];

            arr[jumpto] = arr[start];
            int temp = start;
            start = jumpto;
            jumpto = (temp+k)%arr.length;

        }
        for (int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }

}
