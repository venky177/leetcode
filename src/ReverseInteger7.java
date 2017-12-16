/*
* Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*
* */

public class ReverseInteger7 {

    public static void main(String args[]){
        int a = -120;
        boolean flag = false;
        if(a<0){
            a = -1*a;
            flag=true;
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = (a+"").toCharArray();

        for(int i =arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        int ans =0;
        try {
            ans = Integer.parseInt(sb.toString());
        }
        catch (NumberFormatException e){
            ans = 0;
        }

        ans = flag ? -1*ans : ans;
        System.out.println(ans);

    }

}
