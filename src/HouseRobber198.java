/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber198 {

    public static int caller(){

        int nums[] = {1, 1, 1};

        int dp[] = new int[nums.length+1];

        int n = nums.length;

        if(n==0) return 0;

        if(n==1) return nums[0];

        if(n==2) return nums[0] > nums[1] ? nums[0] : nums[1];

        dp[1] = nums[0];

        for (int i = 2; i <=nums.length; i++) {
            dp[i] = dp[i - 2] + nums[i-1] > dp[i - 1] ? dp[i - 2] + nums[i-1] : dp[i - 1];

        }

        return dp[n];

    }

    public static void main(String args[]) {

        System.out.println(caller());

    }

}
