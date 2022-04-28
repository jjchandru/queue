package com.revature.dsa.queueusingarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQueue {
	
	private Queue queueWithFourItems() {
		Queue queue = new Queue();
		queue.enqueue("John");
		queue.enqueue("Smith");
		queue.enqueue("Eva");
		queue.enqueue("Jack");
		return queue;
	}

	@Test
	void testQueueCreation() {
		Queue queue = new Queue();
		assertEquals("Queue Empty", queue.toString());
	}
	
	@Test
	void testQueueCreation_CheckUsingPeek() {
		Queue queue = new Queue();
		assertNull(queue.peek());
	}
	
	@Test
	void testEnqueue_SingleItem_CheckWithPeek() {
		Queue queue = new Queue();
		queue.enqueue("John");
		assertEquals("John", queue.peek());
	}

	@Test
	void testEnqueue_SingleItem_CheckWithToString() {
		Queue queue = new Queue();
		queue.enqueue("John");
		assertEquals("F - John - R", queue.toString());
	}

	@Test
	void testEnqueue_MultipleItems_CheckWithToString() {
		Queue queue = queueWithFourItems();
		assertEquals("F - John - Smith - Eva - Jack - R", queue.toString());
	}
	
	@Test
	void testDequeue_SingleItem_CheckWithToString() {
		Queue queue = new Queue();
		queue.enqueue("John");
		queue.dequeue();
		assertEquals("Queue Empty", queue.toString());
	}
	
	@Test
	void testDequeue_MultipleItems_CheckWithToString() {
		Queue queue = queueWithFourItems();
		queue.dequeue();
		assertEquals("F - Smith - Eva - Jack - R", queue.toString());
	}
}
