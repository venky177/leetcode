/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */

import java.util.HashMap;

public class SearchInsertPosition35 {

    public static void main(String []args){

        int[] arr = {1,3,4,7,9};
        int target = 0;

        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int ans = 0;
        while(start<end){

            mid = start/2 + end/2;

            if(target == arr[mid]){
                ans = mid;
                break;
            }

            else if(target < arr[mid]){
                end = mid-1;
            }
            else start = mid+1;
        }

        if(target > arr[mid]) ans = start+1;
        else if(target <arr[mid]) ans =start;
       /* if(target < arr[mid]) ans = mid-1;
        if(target > arr[mid]) ans = mid+1;*/
        //if(start == end) ans = start+1;
        System.out.println(ans);

    }

}
