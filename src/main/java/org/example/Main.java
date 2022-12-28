package org.example;

public class Main {
    public static void main(String[] args) {
        MyQueue q1 = new MyQueue(4);
        q1.display();
        q1.enqueue(12);
        q1.enqueue(20);
        q1.display();
        q1.dequeue();
        q1.display();
        q1.enqueue(19);
        q1.enqueue(22);
        q1.enqueue(55);
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.display();
    }
}