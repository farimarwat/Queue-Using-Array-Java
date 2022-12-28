package org.example;
public class MyQueue {
    private int rear;
    private static int[] array;
    public MyQueue(int size) {
        array = new int[size];
        rear = 0;
    }
    public void enqueue(int value) {
        if (rear > array.length) {
            System.out.println("Queue is full");
        } else {
            array[rear] = value;
            rear++;
        }
    }
    public void dequeue(){
        if(array.length == 1){
            System.out.println("No element to delete");
        } else {
            for(int i = 0; i < rear; i++){
                if(i == array.length -1){
                    array[i] = 0;
                } else {
                    array[i] = array[i+1];
                }
            }
            rear--;
        }
    }
    public void display() {
        if (array.length > 0) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
}
