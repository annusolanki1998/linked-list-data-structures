package com.bridgelabz;

public class LinkedListFunctions {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;

    }
    public void printList() {
        if(head == null){
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
}
