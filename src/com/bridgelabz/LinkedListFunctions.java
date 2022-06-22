package com.bridgelabz;

public class LinkedListFunctions {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void appendingNode(int before, int data) {
        Node currentNode = head;
        while (currentNode.data != before) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;

    }

    public void insertInBetween(int before, int after, int data) {
        Node currentNode = head;
        while (currentNode.data != before && currentNode.data != after) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
}
