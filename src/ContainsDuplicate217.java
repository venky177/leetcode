/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */

import java.util.HashMap;

public class ContainsDuplicate217 {

    public static void main(String []args){

        int[] arr = {1,2,3,4,5,2};
        boolean flag = true;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                flag = false;
                break;
            }
            map.put(i,false);
        }
        System.out.println(flag);

    }

}
