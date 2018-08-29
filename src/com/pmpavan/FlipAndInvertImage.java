package com.pmpavan;

public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            for (; j < (A[i].length / 2); j++) {
                System.out.print("Before A1[" + i + "][" + j + "]= " + A[i][j] + " ");
                System.out.println("A2[" + i + "][" + (A[i].length - 1 - j) + "]= " + A[i][A[i].length - 1 - j] + " ");
                System.out.println("Before Flip " + i + " " + j);
                printArray(A);
                swapAndNot(A, i, j);
                System.out.print(" After A1[" + i + "][" + j + "]= " + A[i][j] + " ");
                System.out.println("A2[" + i + "][" + (A[i].length - 1 - j) + "]= " + A[i][A[i].length - 1 - j] + " ");
                System.out.println("After Flip " + i + " " + j);
                printArray(A);
            }
            if (j % 2 == 0) {
                j -= 1;
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = temp;
                System.out.println("j % 2 == 0");
            } else {
                A[i][j] ^= 1;
            }

        }
        System.out.println("Flip ");

        printArray(A);
        return A;
    }

    private void swapAndNot(int[][] A, int i, int j) {
        int temp = A[i][j];
        A[i][j] = A[i][A[i].length - 1 - j] ^ 1;
        A[i][A[i].length - 1 - j] = temp ^ 1;
    }

    public void printArray(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < (A[i].length); j++) {
//                A[i][j] ^= 1;
                System.out.print(A[i][j] + " ");
                if (j == (A[i].length - 1))
                    System.out.println("]");
            }
        }
    }
}
