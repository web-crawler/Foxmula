package com.company.assignment_2;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String []args){

        Set<Integer> hash=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 to exit");
        boolean i=true;
        while(i){
            System.out.println("enter integer");
            int j =sc.nextInt();
            if(j==0)
                break;
            hash.add(j);
        }
        boolean ans = hash.isEmpty();
        if(ans==true)
            System.out.println("HashSet empty");
        else
            System.out.println("HashSet not empty");
    }
}
