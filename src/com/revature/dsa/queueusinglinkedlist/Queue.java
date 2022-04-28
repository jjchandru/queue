package com.revature.dsa.queueusinglinkedlist;

import com.revature.dsa.singlylinkedlist.Node;
import com.revature.dsa.singlylinkedlist.SinglyLinkedList;

public class Queue {
	private SinglyLinkedList<String> list;

	public Queue() {
		list = new SinglyLinkedList<>();
	}
	
	public void enqueue(String data) {
		list.add(data);
	}
	
	public String dequeue() {
		String data = list.getHead().getData();
		list.delete(0);
		return data;
	}
	
	public String peek() {
		if (list.getHead() == null) {
			return null;
		}
		return list.getHead().getData();
	}
	
	public String toString() {
		if (list.getHead() == null) {
			return "Queue Empty";
		}
		String result = "F - ";
		Node<String> pointer = list.getHead();
		while (pointer != null) {
			result += pointer.getData() + " - ";
			pointer = pointer.getNext();
		}
		result += "R";
		return result;
	}
}
