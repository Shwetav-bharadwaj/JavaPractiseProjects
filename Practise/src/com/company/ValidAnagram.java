package com.company;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t)
    {

        if(s.length() != t.length())
        {
            System.out.println("Its not an anagram");
            return false;
        }


        char[] charsarray = s.toCharArray();
        char[] chartarray= t.toCharArray();


        Arrays.sort(charsarray);
        System.out.println("String s Sorted is:"+Arrays.toString(charsarray));
        Arrays.sort(chartarray);
        System.out.println("String t Sorted is:"+Arrays.toString(chartarray));

        if (Arrays.equals(charsarray,chartarray))
        {
            System.out.println("Its an anagram");
            return true;
        }
        else {
            System.out.println("Its not an anagram");
            return false;
        }

    }

}
