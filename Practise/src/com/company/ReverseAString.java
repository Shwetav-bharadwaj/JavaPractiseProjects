package com.company;

public class ReverseAString {

    public String reverseastring(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        System.out.println("the string is:"+sb.toString());
        sb.reverse();
        System.out.println("the reversed string is: "+sb.toString());
        return sb.toString();
    }

    public String reverseastringSecondway(String s)
    {
        char[] c = s.toCharArray();
        String result = "";
        for(int i = c.length-1;i>=0;i--)
        {

            System.out.println("the reversed string is: "+c[i]);
            result = result+ c[i];
            System.out.println("Result is: "+result);
        }
        return result;
    }

}
