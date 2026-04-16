package com.ds.a_SinglyLinkedList;

import com.ds.a_SinglyLinkedList.data.LinkedListGenerator;
import com.ds.a_SinglyLinkedList.data.Node;

public class A_GetMiddleOfLinkedList {

    public static void main(String[] args) {
        Node root = LinkedListGenerator.generateLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println(getMiddle(root));
    }

    public static int getMiddle(Node head) {
        if (head == null) return -1; // Return -1 for empty list

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }

        return slow.data; // Slow will be at the middle node
    }
}
