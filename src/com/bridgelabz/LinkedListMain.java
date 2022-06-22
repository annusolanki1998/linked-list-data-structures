package com.bridgelabz;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Program");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("Simple LinkedList are : " + list);

        LinkedListFunctions linkedListFunctions = new LinkedListFunctions();
        System.out.println("Linked list is :");
        linkedListFunctions.addFirst(56);
        linkedListFunctions.addLast(70);
        linkedListFunctions.printList();
        System.out.println("List after adding element in middle of the list is: ");
        linkedListFunctions.insertInBetween(56, 70, 30);
        linkedListFunctions.printList();
        System.out.println("Searching element found or not is displayed ");
        linkedListFunctions.findNode(30);
        System.out.println("Element 40 added after node 30 in the list");
        linkedListFunctions.appendingNode(30, 40);
        linkedListFunctions.printList();
        System.out.println("Element 40 deleted from the list");
        linkedListFunctions.deleteAnyNode(40);
        linkedListFunctions.printList();
        System.out.println("List is in ascending order ");
        linkedListFunctions.ascendingOrder();
        linkedListFunctions.printList();
    }
}
