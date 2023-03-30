package com.company;

import java.util.Arrays;

public class PalindromeString {

    public boolean isPalindrome(String s) {
        //A man, a plan, a canal: Panama
        System.out.println("The String is :"+s);
        String temp = s.replaceAll("[^a-zA-Z0-9]", "");
        temp = temp.toLowerCase();
        System.out.println("The String is :"+temp);
        boolean isPalindrome = true;

        for(int i = 0, j = temp.length()-1;i<(temp.length()/2);i++,j--)
        {
            System.out.println("The compating Strings are: "+temp.charAt(i)+"**"+temp.charAt(j));
            if(temp.charAt(i)!=temp.charAt(j))
            {
                isPalindrome = false;
                break;
            }
            else
                isPalindrome = true;

        }
        return isPalindrome;

    }

}
