package com.ds.a_BinaryTree.data;

public class Node {
    public int val;
    public Node left_child;
    public Node right_child;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
