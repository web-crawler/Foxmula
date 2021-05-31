package com.company.assignment_2;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Task3 {
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
        System.out.println("Items of HashSet");
        Iterator<Integer> j = hash.iterator();
        while (j.hasNext())
            System.out.println(j.next());

    }
}
