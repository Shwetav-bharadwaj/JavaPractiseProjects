package com.company;

public class PrimeOrNot {

    public Boolean isPrime(int x)
    {
        boolean flag = false;
        for (int i = 2; i < x/2; i++)
        {
            if (x%i==0)
            {
                System.out.println("the number is"+i);
                flag = true;
                break;
            }

        }
        return flag;



    }

}
