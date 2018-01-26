/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?


 */
public class LongestIncreasingSubsequence300 {

    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int max = Integer.MAX_VALUE;
        int lis[] =  new int[n];
        int i=0,j=0;
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++ )
            lis[i] = 1;

    /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++ )
            for (j = 0; j < i; j++ )
                if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

    /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++ )
            if (max < lis[i])
                max = lis[i];

        return max;

    }

}
