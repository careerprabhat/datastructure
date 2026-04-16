package com.ds.a_BinaryTree.data;

/**
 * This class is responsible for generating a sample binary tree for testing and demonstration purposes.
 * The generated tree has the following structure:
 *
 *         5
 *        / \
 *       4   10
 *      / \  / \
 *     2  3 8  11
 *
 * This structure allows us to test various tree traversal algorithms and other tree-related operations.
 */
public class NodeManager {

    public static Node generateBinaryTree() {
        Node root = new Node(5);
        root.left_child = new Node(4);
        root.left_child.left_child= new Node(2);
        root.left_child.right_child = new Node(3);

        root.right_child = new Node(10);
        root.right_child.left_child = new Node(8);
        root.right_child.right_child = new Node(11);
        return root;
    }
}
