package com.yash;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 10};
        int maxVal = max(arr);
        System.out.println(maxVal);
    }
    private static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = 0;
        for ( int i = 0 ; i < arr.length; i++ ) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
