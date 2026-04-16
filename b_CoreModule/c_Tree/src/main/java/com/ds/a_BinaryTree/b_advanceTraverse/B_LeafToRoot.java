package com.ds.a_BinaryTree.b_advanceTraverse;

import com.ds.a_BinaryTree.data.Node;
import com.ds.a_BinaryTree.data.NodeManager;

import java.util.Stack;

public class B_LeafToRoot {
    public static void main(String[] args) {
        System.out.println("Reverse-order Traversal:");
        leafToRoot(NodeManager.generateBinaryTree());
        System.out.println();
        System.out.println("Reverse-order Traversal (Iterative):");
       // reverseOrderIterative(NodeManager.generateBinaryTree());
    }

    private static void leafToRoot(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(true) {

            if(root.left_child!=null) stack.push(root.left_child);

            if(root.right_child!=null) stack.push(root.right_child);


        }
    }


}
