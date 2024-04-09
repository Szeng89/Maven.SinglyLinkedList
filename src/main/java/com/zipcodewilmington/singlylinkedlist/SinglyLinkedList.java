package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {




    private class Node{
        T data;
        Node next = null;
        public Node(T data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail;
    public void addFirst(T thingBeingAdded) {
        Node newNode = new Node(thingBeingAdded);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public T get(int index) {
        Node node = head;
        int i = 0;
        while(i < index) {
            node = node.next;
            i++;
        }
        return node.data;
    }

    public void addLast(T thingBeingAdded) {
        Node newNode = new Node(thingBeingAdded);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}
