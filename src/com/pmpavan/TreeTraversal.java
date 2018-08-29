package com.pmpavan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> rightNodes = new Stack<>();
        while (root != null) {
            list.add(root.val);
            if (root.right != null) {
                rightNodes.push(root.right);
            }
            root = root.left;
            if (root == null && !rightNodes.empty()) {
                root = rightNodes.pop();
            }
        }
        return list;
    }
}
