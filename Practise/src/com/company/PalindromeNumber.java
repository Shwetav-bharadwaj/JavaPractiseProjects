package com.company;

import java.sql.SQLOutput;

public class PalindromeNumber {

    public boolean isPalinderome(int n)
    {
        int temp=0;
        while(n>0)
        {
            temp = temp*10;
            temp = temp+(n%10);
            n=n/10;
        }
        System.out.println(temp);

        if(temp == n)
        {
            return true;
        }
        else
            return false;

    }

}
