package com.ds.a_BinaryTree.b_advanceTraverse;


import com.ds.a_BinaryTree.data.Node;
import com.ds.a_BinaryTree.data.NodeManager;

import java.util.ArrayDeque;
import java.util.Queue;

public class A_LevelOrder {
    public static void main(String[] args) {
        System.out.println("Level-order Traversal:");
        levelOrder(NodeManager.generateBinaryTree());

    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left_child != null) queue.offer(node.left_child);
                if (node.right_child != null) queue.offer(node.right_child);
            }
            System.out.println(); // New line after each level
        }
    }
}
