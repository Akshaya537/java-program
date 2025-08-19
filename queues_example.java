package miniproject;

import java.util.Scanner;

public class queues_example {
int count,cap,front,rear;
int[]queue;
queues_example(int size){
	cap=size;
	count=0;
	front=0;
	rear=-1;
	queue=new int[cap];
}
boolean isFull() {
	return count==cap;
}
boolean isEmpty() {
	return count==0;
}
void enqueue(int value) {
	if(isFull()) {
		System.out.println("queue is overflow");
		return;
	}
	rear=(rear+1)%cap;
	queue[rear]=value;
	count++;
	System.out.println(value+"insert");
}
int dequeue(int value) {
	if(isEmpty()) {
		System.out.println("queue is underflow");
		return-1;
	}
	value=queue[front];
front=(front+1)%cap;
count--;
System.out.println(value+"remove");
return value;
}
void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    System.out.print("Queue elements: ");
    int i = (front + 1) % cap;
    while (i != (rear + 1) % cap) {
        System.out.print(queue[i] + " ");
        i = (i + 1) % cap;
    }
    System.out.println();
}

public static void main(String[] args) {
	queues_example q1=new queues_example(5);
	q1.enqueue(56);
	q1.enqueue(10);
	q1.enqueue(15);
	q1.dequeue(10);
	q1.display();
}
}