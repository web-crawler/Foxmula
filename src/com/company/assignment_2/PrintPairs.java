package com.company.assignment_2;

import java.util.HashSet;

public class PrintPairs {
    public static void main(String args[]){
        HashSet<Integer>s=new HashSet<Integer>();
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 16;
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
    }

