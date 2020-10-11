package com.capg;

public class MyQueue {
	private final LinkedList list;

	public MyQueue() {
		this.list = new LinkedList();
	}

	public void enqueue(INode node) {
		list.add(node);
	}

	public void dequeue() {
		list.popLast();
	}
	
	public void print() {
		list.printNode();
	}
}