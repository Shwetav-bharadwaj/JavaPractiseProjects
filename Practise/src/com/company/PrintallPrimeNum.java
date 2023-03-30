package com.company;

import java.util.ArrayList;

public class PrintallPrimeNum {


    public void printallprimenumbers(int n)
    {
        for(int j=2;j<n;j++)
        {
            System.out.println("Calculating for**" + j);
            boolean isPrime = true;
            for (int i = 2; i < j; i++)
            {
                if (j % i == 0) {
                    isPrime = false;
                    System.out.println(i);
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(+n + "is a prime number");
            } else {
                System.out.println(+n + "is a NOT prime number");
            }
        }
    }
}
