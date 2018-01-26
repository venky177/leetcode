/*
* You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.*/
public class FirstBadVersion278 {

    public boolean isBadVersion(int version){
        return 1<=version;

    }

    public int firstBadVersion(int n) {

        int max = n;
        int min = 1;


        while (true){
            int mid = min +(max-min)/2;
            boolean myguess = isBadVersion(mid);
            if(myguess && (min==max || max<min)) return mid;
            else if(myguess)max = mid-1;
            else min = mid+1;
        }
    }

    public static void main(String args[]){

        FirstBadVersion278 fs = new FirstBadVersion278();
        System.out.println(fs.firstBadVersion(2));

    }

}
