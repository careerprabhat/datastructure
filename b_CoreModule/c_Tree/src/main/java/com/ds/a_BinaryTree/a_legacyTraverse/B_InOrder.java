package com.ds.a_BinaryTree.a_legacyTraverse;

import com.ds.a_BinaryTree.data.Node;
import com.ds.a_BinaryTree.data.NodeManager;

import java.util.Stack;

/**
 *         5
 *       /   \
 *      4     10
 *     / \   /  \
 *    2   3 8   11
 *    In-order traversal of the above tree is: 2 4 3 5 8 10 11
 */
public class B_InOrder {
    public static void main(String[] args) {
        recursive(NodeManager.generateBinaryTree());
        System.out.println();
        non_recursive(NodeManager.generateBinaryTree());
    }

    private static void recursive(Node root) {
        if( root != null) {
            recursive(root.left_child);
            System.out.print(root.val +" ");
            recursive(root.right_child);
        }
    }

    private static void non_recursive(Node root) {
            if (root == null) return;

           Stack<Node> stack = new Stack<>();

            while (root != null || !stack.isEmpty()) {
                // Reach the left most Node of the current Node
                while (root != null) {
                    stack.push(root);
                    root = root.left_child;
                }

                // Current must be null at this point
                root = stack.pop();
                System.out.print(root.val + " ");

                // We have visited the node and its left subtree. Now, it's right subtree's turn
                root = root.right_child;
            }

    }
}
