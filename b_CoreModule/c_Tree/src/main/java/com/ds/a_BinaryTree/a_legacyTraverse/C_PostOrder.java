package com.ds.a_BinaryTree.a_legacyTraverse;

import com.ds.a_BinaryTree.data.Node;

import java.util.Stack;

public class C_PostOrder {
    public static void main(String[] args) {

    }

    public static void recursivePostOrder(Node root) {
        if (root == null) {
            return;
        }
        // Traverse left subtree
        recursivePostOrder(root.left_child);
        // Traverse right subtree
        recursivePostOrder(root.right_child);
        // Process the current node (e.g., print its value)
        System.out.print(root.val + " ");
    }

    public static void non_recursive(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node lastVisited = null;
        Node current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left_child; // Move to left child
            } else {
                Node peekNode = stack.peek();
                // If right child exists and traversing node from left child, then move right
                if (peekNode.right_child != null && lastVisited != peekNode.right_child) {
                    current = peekNode.right_child; // Move to right child
                } else {
                    System.out.print(peekNode.val + " "); // Process the node
                    lastVisited = stack.pop(); // Mark this node as visited
                }
            }
        }
    }
}
