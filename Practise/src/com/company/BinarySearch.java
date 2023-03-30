package com.company;

public class BinarySearch {
   //b15.binsearch(ar,0 , ar.length-1,20 );
   //int[] ar = {-1,0 , 10 , 14 , 17 , 20 , 25};
    public int binsearch(int[] arr , int l , int r , int x) {
        if (r >= 1)
        {
            int mid = (l + r) / 2;
            System.out.println("The mid Value is" + mid);


            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x)
                return binsearch(arr, 0, mid - 1, x);

            else
                return binsearch(arr, mid + 1, arr.length - 1, x);
        }
        return -1;
    }

}
