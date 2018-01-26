import java.util.HashMap;

/*
* Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

*/
public class ContainsDuplicatesII219 {

    public static void main(String []args){

        int[] arr = {-1,-1};
        int k =1;
        boolean flag = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                if(Math.abs(i-map.get(arr[i]))<=k){
                    flag = false;
                    break;
                }
            }
            map.put(arr[i],i);
        }
        System.out.println(flag);

    }

}
