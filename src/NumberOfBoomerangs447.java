import java.util.HashMap;
import java.util.Map;

/*
Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class NumberOfBoomerangs447 {

    public static void main(String args[]){

        int nums[][] = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(i==j)continue;

                int dis = dist(i,j,nums);

                map.put( dis,map.getOrDefault(dis,0)+1);
            }
        }

        int ans = 0;
        for (Integer n:map.values()) {
            ans+=(n*(n-1));
        }

        System.out.println(ans);

    }

    public static int dist(int i,int j,int[][]nums){
        int dx = nums[i][0]-nums[j][0];
        int dy = nums[i][1]-nums[j][1];

        return dx*dx+dy*dy;
    }


}
