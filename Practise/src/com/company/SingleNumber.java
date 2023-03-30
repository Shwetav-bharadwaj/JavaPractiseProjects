package com.company;

import java.util.Arrays;

public class SingleNumber {
    public int findsingleNumber(int[] nums) {
        System.out.println("The array is "+Arrays.toString(nums));
        int result =0;
        for(int i = 0;i<nums.length;i++)
        {
            result = result^nums[i];
            System.out.println("Result is :"+result+" and Value of i is "+nums[i]);
        }
        return result;

    }
}
