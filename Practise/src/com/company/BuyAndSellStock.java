package com.company;

import java.util.Arrays;

public class BuyAndSellStock
{
    public int maxProfit(int[] prices)
    {
        int profit=0;
        System.out.println("The Array of prices are"+ Arrays.toString(prices));

        for(int i = 0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                System.out.println("The two comparing Strings are:"+prices[i]+"&"+prices[j]);
                if(prices[j]-prices[i]>profit)
                {
                    System.out.println("The Profit here is"+profit);
                    profit = prices[j]-prices[i];
                }
            }
        }

        System.out.println("The final profit is: "+profit);
        return profit;
    }
}
