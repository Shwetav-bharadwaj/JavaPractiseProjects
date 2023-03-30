package com.company;

import java.util.Arrays;

public class ReverseWords
{

    public String doreversewords(String s)
    {
        String[] wordarray = s.split(" ");
        String result = "";
        System.out.println("the word array is:" + Arrays.toString(wordarray));
        for (int i = wordarray.length-1 ; i>=0;i--)
        {
            result = result +wordarray[i]+" ";
        }
        System.out.println("the result is: "+result);
        return result;
    }
}
