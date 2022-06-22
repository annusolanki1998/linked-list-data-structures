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
        System.out.println("Elements added in the list are :");
        linkedListFunctions.addFirst(56);
        linkedListFunctions.addLast(70);
        linkedListFunctions.insertInBetween(56, 70, 30);
        linkedListFunctions.printList();
        linkedListFunctions.deleteFirst();
        linkedListFunctions.printList();

    }


}
