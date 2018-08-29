package com.pmpavan;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
//        int A[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int A[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
//        int A[][] = {{1}};
//        int A[][] = {{1,1},{1,1}};
//        flipAndInvertImage.flipAndInvertImage(A);


        //AtoI
//        AtoI atoI = new AtoI();
//        System.out.println("char num " + atoI.myAtoi("-91283472332"));

        //Maximum swap
//        MaximumSwap swap = new MaximumSwap();
//        swap.maximumSwap(2736);


        //BSTIterator
//        [1,2,3,null,4] ==> [2,4,1,3]
//        BSTIterator i = new BSTIterator(root);
//        while (i.hasNext()) v[f()] = i.next();


        //Simplify Path
        SimplifyPath simplifyPath = new SimplifyPath();
//        String path = simplifyPath.simplifyPath("/home/");
//        String path = simplifyPath.simplifyPath("/..");
//        String path = simplifyPath.simplifyPath("/home//foo/");
        String path = simplifyPath.simplifyPath("/home/foo/./bar/");
        System.out.println(path);
    }
}
