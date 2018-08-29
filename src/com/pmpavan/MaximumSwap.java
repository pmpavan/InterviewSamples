package com.pmpavan;

public class MaximumSwap {
    public int maximumSwap(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] arr = new int[10];
        int max = 0, index = -1, swapIndex = -1;
        for (char c : A) {
            index++;
            if (max < Integer.parseInt(String.valueOf(c))) {
                max = Integer.parseInt(String.valueOf(c));
                swapIndex = index;
                System.out.println("swap number " + swapIndex);
            }

        }
        System.out.println("number " + max + " " + A[swapIndex]
                + " " + Integer.parseInt(String.valueOf(A[0])));
        if (index != -1 && swapIndex != -1 && A.length != 0 && Integer.parseInt(String.valueOf(A[0])) != max) {
            char temp = A[0];
            A[0] = A[swapIndex];
            A[swapIndex] = temp;
            System.out.println("swap " + A[0] + " " + A[swapIndex] + " " + (char) max);
        }
        return Integer.parseInt(new String(A));
    }
}
