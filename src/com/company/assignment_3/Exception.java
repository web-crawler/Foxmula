package com.company.assignment_3;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number: ");
            int numerator = sc.nextInt();
            try {
                boolean res=doDivide(numerator);
                if(res==false)
                throw(new Exception());
                else
                    System.out.println("Number is even and not prime");
            } catch (Exception e) {
                System.out.println("Exception, number is odd and prime ");
            }
        }
        public static boolean doDivide(int a) throws Exception{
            boolean flag1 = false;
            boolean flag2=false;
            for (int i = 2; i <= a / 2; ++i) {
                if (a % i == 0 ) {
                    flag1 = true;
                    break;
                }
                if(a%2!=0)
                    flag2=false;
            }
            if(flag1 || flag2)
        return true;
            else
                return false;
        }
    }


