/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeros283 {

    public static void main(String args[]){

        int arr[] = {1,0,2,0,3,0,5};

        if(arr.length==0)return;

        int fastPointer=0,slowPointer=0;

        while (fastPointer<arr.length){

            if(arr[fastPointer]==0){
                fastPointer++;
                continue;
            }

            arr[slowPointer]=arr[fastPointer];
            fastPointer++;
            slowPointer++;
        }

        for(;slowPointer<arr.length;slowPointer++){
            arr[slowPointer]=0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}
