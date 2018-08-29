package com.pmpavan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * <p>
 * Corner Cases:
 * <p>
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class SimplifyPath {
    public String simplifyPath(String path) {

        String[] arr = path.split("/");
//        if (arr.length >= 2) {
//            if (arr[arr.length - 1].equals("..") || arr[arr.length - 1].equals(".")) {
//                arr = Arrays.copyOf(arr, arr.length - 1);
//            }
//        }
//
//        StringBuilder builder = new StringBuilder();
//        for (String arrpath : arr) {
//            if (!arrpath.isEmpty())
//                builder.append("/").append(arrpath);
//        }
//        return builder.length() == 0 ? "/" : builder.toString();
        Stack<String> stack = new Stack<>();
        ArrayList<String> popList = new ArrayList<>();
        popList.add("..");
        for (String dir : arr) {
            if (popList.contains(dir) && !stack.empty()) {
                stack.pop();
            } else if (!popList.contains(dir) && !dir.isEmpty() && !".".equals(dir)) {
                stack.push(dir);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String arrpath : stack) {
            if (!arrpath.isEmpty())
                builder.append("/").append(arrpath);
        }
        return builder.length() == 0 ? "/" : builder.toString();
    }
}
