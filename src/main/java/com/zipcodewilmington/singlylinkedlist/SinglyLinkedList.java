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
    public void remove(int index) {
        // keep track of current and previous node
        Node currentNode = head;
        Node previousNode = null;

        // iterate through list until desired index
        for (int i = 0; i < index; i ++) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        // Handle if we are removing the first element
        if ( previousNode == null) {
            head = currentNode.next;
        } else {
            // skip the node we want to remove
            previousNode.next = currentNode.next;
        }

        // update tail if ness
        if (currentNode.next == null) {
            tail = previousNode;
        }
    }
    public boolean contains(T doesItContain) {
        // Start at the beginning of list
        Node node = head;

        // interate as long as there are nodes to check
        while (node != null) {

            // check if current node match what were looking for
            if (node.data.equals(doesItContain)) {
                return true;
            }

            // move to net node
            node = node.next;
        }
        return false;
    }
    public int find(T lookingToFind) {
        // Start at the beginning of list
        Node node = head;

        int index = 1;

        // loop as long as theres nodes to check
        while (node != null) {

            //if the current node has what were looking for
            if (node.data == lookingToFind) {

                return index;
            }

            //if no match move to next node and increase the counter
            index++;
            node = node.next;
        }
        return -1;
    }

    public int size() {
        // Start at the beginning of list
        Node node = head;


        int count = 0;

        //loop as long as there is a next node
        while (node != null) {

            //move to next node and increment count
            node = node.next;
            count++;
        }
        return count;
    }
}
