package com.company.assignment_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 to exit");
        int array[] = new int[100];
        int count[] = new int[100];
        System.out.println("enter number of elements in the array");
        int no_of_elements = sc.nextInt();
        for (int i = 0; i < no_of_elements; i++) {
            System.out.println("enter integer");
            array[i] = sc.nextInt();
            if (array[i] == 0)
                break;
        }
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            count[temp]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0 && count[i] == 1) {
                System.out.printf("%d occurs %d time\n", i, count[i]);
            } else if (count[i] >= 2) {
                System.out.printf("%d occurs %d times\n", i, count[i]);
            }
        }
    }
}


