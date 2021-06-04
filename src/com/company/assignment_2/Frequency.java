package com.company.assignment_2;

public class Frequency {
    public static void main(String args[]) {
        int arr[] = {1, 2, 8, 3, 2, 1, 4, 1, 3, 5, 1};
        int frequency[] = new int[arr.length];
        int visited = -1;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i]!=visited)
            System.out.println("Element " + arr[i] + " has frequncy: " + frequency[i]);

        }
    }
}
