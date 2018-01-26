/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

import java.util.HashMap;

public class LongestPalindrome409 {

    public static void main(String args[]){

        String s = "abccccdd";

        HashMap<Character,Integer> map= new HashMap<>();

        for(Character c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int ans = 0;
        for(Character c :map.keySet()){
            ans+=map.get(c)/2;
        }

        if(ans == s.length()) return;
        else ans++;

    }

}
