package com.company;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
       ArrayList<Integer> result = new ArrayList<Integer>();
       int start = 0;
       int end = 0;
       int current_sum = 0;

       for(int i = 0; i<n;i++)
       {
           current_sum = current_sum+arr[i];
           System.out.println("Current Sum is "+current_sum);
           if(current_sum>s)
           {
            current_sum = current_sum-arr[start];
            start++;
           }

           if(current_sum==s)
           {
               result.add(start);
               result.add(i);

           }

       }
        System.out.println("The result is: "+result);
        return result;


    }


}
