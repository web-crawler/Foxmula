package com.company.assignment_2;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String []args){

        ArrayList<Integer> arrli=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        boolean close=false;
        System.out.println("enter 0 to exit");
        boolean i=true;
        //int i =sc.nextInt();
        while(i){
            System.out.println("enter integer");
            int j =sc.nextInt();
            //arrli.add(j);
            if(j==0)
                break;
            arrli.add(j);
            //System.out.println("program terminated");
        }

        //System.out.println(arrli);

        boolean ans = arrli.isEmpty();
        if(ans==true)
            System.out.println("array list empty");
            else
                System.out.println("array list not empty");
    }
}
