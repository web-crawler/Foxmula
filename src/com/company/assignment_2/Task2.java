package com.company.assignment_2;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String []args){

        Set<Integer> hash=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 to exit");
        boolean i=true;
        //int i =sc.nextInt();
        while(i){
            System.out.println("enter integer");
            int j =sc.nextInt();
            //arrli.add(j);
            if(j==0)
                break;
            hash.add(j);
            //System.out.println("program terminated");
        }

        //System.out.println(arrli);

        boolean ans = hash.isEmpty();
        if(ans==true)
            System.out.println("set empty");
        else
            System.out.println("set not empty");
    }
}
