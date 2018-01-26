/*
Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).

Example 1:

Input:
3

Output:
3
Example 2:

Input:
11

Output:
0

Explanation:
The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.

 */
public class NthDigit400 {

    public static void main(String args[]){

        int n = 3;

        int noOfDigits = 0;
        int count =0;

        while (true){
            count++;

            noOfDigits+=Math.log10(count)+1;

            if(noOfDigits>=n)break;

        }

        int index = noOfDigits - n;
        int ans = 0;
        while (index>=0){
            ans = count%10;
            count = count/10;
            index--;
        }


        System.out.println(ans);

    }

}
