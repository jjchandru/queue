package com.revature.dsa.queueusingarray;

public class Queue {
	private String[] queue;
	private int front;
	private int rear;
	
	public Queue() {
		queue = new String[Short.MAX_VALUE];
		front = 0;
		rear = 0;
	}
	
	public void enqueue(String data) {
		queue[rear] = data;
		rear++;
	}
	
	public String dequeue() {
		if (rear == 0) {
			return null;
		}
		String data = queue[front];
		for (int i = 0; i < rear - 1; i++) {
			queue[i] = queue[i + 1];
		}
		rear--;
		return data;
	}
	
	public String peek() {
		if (rear == 0) {
			return null;
		}
		return queue[rear - 1];
	}
	
	public String toString() {
		if (rear == 0) {
			return "Queue Empty";
		}
		String result = "F - ";
		for (int i = front; i < rear; i++) {
			result += queue[i] + " - "; 
		}
		result += "R";
		return result;
	}

}
