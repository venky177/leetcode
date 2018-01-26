public class SearchForARange34 {

    public static void main(String args[]){

        int nums[] = {5, 7, 7, 8, 8, 10};

        int target = 8;


        int max = nums.length;
        int min =0;
        int mid=0;

        while (true){

            mid = min + (max-min)/2;

            if(nums[mid]==target)break;
            else if(nums[mid]>target)mid = lower(mid,nums)-1;
            mid = upper(mid,nums)+1;

        }

        int ans[] = {lower(mid,nums),upper(mid,nums)};


    }

    public static int upper(int index,int[] nums){
        while (index<nums.length && nums[index]==nums[index+1])index++;
        return index;
    }

    public static int lower(int index,int[] nums){
        while (index>0 && nums[index]==nums[index-1])index--;
        return index;
    }

}
