package com.company;


//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        System.out.println("The length of the Array is: "+(nums.length));

        for(int i=0;i<=nums.length-2;i++)
        {
            for (int j=i+1;j<=nums.length-1;j++)
            {
                System.out.println("The Value of i is :"+nums[i]);
                System.out.println("The Value of j is :"+nums[j]);
                if(nums[i] == nums[j])
                {
                    System.out.println("The array contains Duplicate number");
                    return true;
                }

            }
        }

        return false;
    }

/*    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

    There is only one repeated number in nums, return this repeated number.

    You must solve the problem without modifying the array nums and uses only constant extra space.

    Example 1:

    Input: nums = [1,3,4,2,2]
    Output: 2
    Example 2:

    Input: nums = [3,1,3,4,2]
    Output: 3*/

    public int findduplicate()
    {
      int[] nums =  {1,3,6,5,2};
        System.out.println("the Array given is"+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("the Array given is"+Arrays.toString(nums));

        for (int i = 0;i<nums.length-2;i++)
        {
            if( nums[i] == nums[i+1])
            {
                    return nums[i];
            }
        }
        return -1;

    }

    public int findduplicatehashsetway()
    {
        int[] nums =  {1,3,6,2,3};
        System.out.println("the Array given is"+Arrays.toString(nums));

        Set<Integer> hs = new HashSet<Integer>();
        for(int n : nums)
        {
            if(hs.contains(n))
            {
                System.out.println("Found in set already"+n);
                return n;

            }
            hs.add(n);

        }
        return -1;
    }

}

