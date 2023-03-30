package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MegeTwoSortedArrays {
    int[] a = {1,3,5,7};
    int[] b = {0,2,4,6,8};

    public int[] merge(int[] a, int []b)
    {
       int lengthofA = a.length;
       int lengthofB = b.length;
       int reslength = lengthofA + lengthofB;

        int[] resultArray= new int[reslength];
        for (int i=0;i<lengthofA;i++)
        {
            resultArray[i] = a[i];
        }
        System.out.println(Arrays.toString(resultArray));
        for (int j=0,k=lengthofA; j<lengthofB ;j++,k++)
        {
            resultArray[k] = b[j];
        }
        System.out.println(Arrays.toString(resultArray));
        Arrays.sort(resultArray);
        System.out.println("Sorted Array is"+Arrays.toString(resultArray));
        return resultArray;
    }

    public void mergewithoutSpace(int[] a, int []b)
    {
        int lengthofA = a.length;
        int lengthofB = b.length;

        for(int i =0;i<lengthofA;i++)
        {
            for(int j =0;j<lengthofB;j++)
            {
                System.out.println("The value of i: "+i+"the j is: "+j);
                if(a[i]>b[j])
                {
                    int temp=a[i];
                    a[i]= b[j];
                    b[j]=temp;
                }

            }
        }
        System.out.println("last"+Arrays.toString(a));
        Arrays.sort(b);
        System.out.println("last"+Arrays.toString(b));


    }

}
