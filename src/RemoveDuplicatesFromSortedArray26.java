/*
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray26 {

    public static void main(String args[]){

        int arr[] = {1,1,2,2,3,4,5};

        if(arr.length==0)return;

        int fastPointer=0,slowPointer=0;

        while (fastPointer!=arr.length-1){

            if(arr[fastPointer]!=arr[fastPointer+1]){
                arr[slowPointer]=arr[fastPointer];
                slowPointer++;
            }
            fastPointer++;
        }

        arr[slowPointer]=arr[fastPointer];

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //System.out.println(slowPointer);

    }

}
