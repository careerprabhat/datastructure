package com.ds.a_BinaryTree.a_legacyTraverse;

import com.ds.a_BinaryTree.data.Node;
import com.ds.a_BinaryTree.data.NodeManager;

import java.util.Stack;

public class A_PreOrder {

    public static void main(String[] args) {

        System.out.println("Pre-order Traversal (Recursive):");
        preOrderRecursive(NodeManager.generateBinaryTree());

        System.out.println();

        preOrderIterative(NodeManager.generateBinaryTree());
    }
    public static void preOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // Visit the root node
        preOrderRecursive(root.left_child); // Traverse left subtree
        preOrderRecursive(root.right_child); // Traverse right subtree
    }

    public static void preOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.val + " "); // Visit the current node
            // Push right child first so that left child is processed first
            if (current.right_child != null) {
                stack.push(current.right_child);
            }
            if (current.left_child != null) {
                stack.push(current.left_child);
            }
        }
    }
}
