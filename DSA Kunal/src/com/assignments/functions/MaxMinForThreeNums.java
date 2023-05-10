package com.assignments.functions;

import java.util.Scanner;

public class MaxMinForThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxResult = maximumOfThreeNumbers(a, b, c);
        int minResult = minimumOfThreeNumbers(a, b, c);
        System.out.println("Maximum value: " + maxResult);
        System.out.println("Minimum value: " + minResult);
    }

    static int maximumOfThreeNumbers(int a, int b, int c) {
        int max = 0;
        if ( a > b && a > c ) {
            max = a;
        }else if( b > c && b > a ) {
            max = b;
        } else if (c > b && c > a) {
            max = c;
        }

        return max;
    }

    static int minimumOfThreeNumbers(int a, int b, int c) {
        int min = 0;
        if (a < b && a < c) {
            min = a;
        } else if(b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        return min;
    }
}

