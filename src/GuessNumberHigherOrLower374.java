/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.
 */

public class GuessNumberHigherOrLower374 {

    static public int mynum = 0;

    public int guess(int num){
        if(num==mynum)return 0;
        if(num>mynum) return -1;
        return +1;

    }

    public int guessNumber(int n,int mynum) {

        int max = n;
        int min = 1;

        this.mynum = mynum;

        if (guess(n)==0) return n;

        while (true){
            int mid = min +(max-min)/2;
            int myguess = guess(mid);
            if(myguess==0) return mid;
            else if(myguess==-1)max = mid-1;
            else min = mid+1;
        }

    }


    public static void main(String args[]){
        GuessNumberHigherOrLower374 gg = new GuessNumberHigherOrLower374();
        System.out.println(gg.guessNumber(4,1));
    }


}
