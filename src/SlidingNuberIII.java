import java.util.HashSet;
import java.util.Set;

/*
* Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
*
* */
public class SlidingNuberIII {

    public static void main(String args[]){

       int[] nums = {2,1,2,3,4,1};

        Set<Integer> set = new HashSet<>();

        if(nums[0]==nums[1])
        {
            int temp = nums[1];
            nums[1]=nums[2];
            nums[2]=temp;
        }

        set.add(nums[0]);
        set.add(nums[1]);

        for(int i=2;i<nums.length;i++){

            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else set.add(nums[i]);
        }
int ans[] = new int[2];
        int i=0;
        for (Integer x:set
             ) {
            ans[i]=x;
            i++;
        }



    }


}
