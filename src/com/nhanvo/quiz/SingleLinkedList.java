package com.nhanvo.quiz;


public class SingleLinkedList {
	private Element head;
	private Element tail;
	private int size;
	
	/*
	 * Constructor
	 */
	public SingleLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	// 1. Append an element into the linked list
	public void append(int data) {
		Element node = new Element(data, null);
		size++;
		
		// Linked list empty
		if (head == null){
			head = node;
			tail = head;
			
		// Linked list not empty
		} else {
			tail.setLink(node);
			tail = node;
		}
	}
	
	// 2. Remove the tail element from a linked list
	
	
	/*
	 * Display data in linked list
	 */
	public void display() {
		// Linked list is empty
		if (size == 0) {
			System.out.println("Empty linked list");
			return;
		}
		
		// Linked list only have one node
		if (head.getLink() == null) {
			System.out.println(head.getData());
			return;
		}
		Element node = head;
		// Linked list have many node
		while (size > 0) {
			System.out.print(node.getData() + " -> ");
			node = node.getLink();
			size --;
		}
		
	}
	
	
	// 3. Remove all element in the linked list that is great than a target value
}
