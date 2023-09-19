/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
public class MyQueue {
    private Node front;
    private Node rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(PrintJob data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public PrintJob dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        PrintJob data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public PrintJob peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private class Node {
        PrintJob data;
        Node next;

        public Node(PrintJob data) {
            this.data = data;
            this.next = null;
        }
    }
}


