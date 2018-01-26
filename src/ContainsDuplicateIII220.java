/*
Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.*/

import java.util.HashMap;

public class ContainsDuplicateIII220 {

    public static void main(String []args){

        int[] arr = {1,3,1};
        int k =2;
        int t = 1;
        boolean flag = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=-t;j<=t;j++){
                if(map.containsKey(arr[i]+j)){
                    if(Math.abs(i-map.get(arr[i]+j))<=k){
                        flag = false;
                        break;
                    }
                }
            }

            map.put(arr[i],i);
        }
        System.out.println(flag);

    }

}
