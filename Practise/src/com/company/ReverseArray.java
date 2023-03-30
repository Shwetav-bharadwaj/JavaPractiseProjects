package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public int[] reverseanArray(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        System.out.println("Array Before Reverse is : "+ Arrays.toString(nums));
        while (start<end)
        {
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
        System.out.println("Array after Reverse is : "+ Arrays.toString(nums));
        return nums;
    }
}
