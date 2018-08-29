package com.pmpavan;


import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * <p>
 * Calling next() will return the next smallest number in the BST.
 * <p>
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
public class BSTIterator {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    Stack<TreeNode> stack;

    public BSTIterator(TreeNode cur) {
        stack = new Stack<TreeNode>();

        while (cur != null) {
            stack.push(cur);
            if (cur.left != null)
                cur = cur.left;
            else
                break;

        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stack.pop();
        TreeNode cur = node;
        // traversal right branch
        if (cur.right != null) {
            cur = cur.right;
            while (cur != null) {
                stack.push(cur);
                if (cur.left != null)
                    cur = cur.left;
                else
                    break;
            }
        }
        return node.val;

    }
}
