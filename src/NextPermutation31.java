

public class NextPermutation31 {

    public static void main(String args[]){

        int nums[] = {1,5,8,4,7,6,5,3,1};

        int i = nums.length-2;

        while (i>=0 && nums[i+1] <=nums[i]){
            i--;
        }

        if(i>=0){
            int j = nums.length-1;
            while (j>=0 && nums[j]<=nums[i])j--;


        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }

        int j=nums.length-1;
        i++;

        while (j>i){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }

        for (Integer a :nums)
        System.out.println(a);


    }




}
