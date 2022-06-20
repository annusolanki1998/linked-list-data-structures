package com.bridgelabz;

public class LinkedListFunctions {
    Node head;

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
}
