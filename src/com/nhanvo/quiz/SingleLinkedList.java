package com.nhanvo.quiz;

import sun.security.action.GetLongAction;

public class SingleLinkedList {
	
	private Node start;
	private Node end;
	private int size;
	
	/*
	 * Constructor
	 */
	public SingleLinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	

	public void appendAtStart(int data) {
		Node node = new Node(data, null);
		size++;
		
		// Linked list is empty
		if (start == null){
			start = node;
			end = start;
			
		// Linked list not empty
		} else {
			node.setLink(start);
			start = node;
		}
	}
	
	
	public void display() {
		// Linked list is empty
		if (size == 0) {
			System.out.println("Empty linked list");
			return;
		}
		
		// Linked list only have one node
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Node node = start;
		// Linked list have many node
		while (size > 0) {
			System.out.println(node.getData());
			node = node.getLink();
			size --;
		}
		
	}
	// 1. Append an element into the linkedlist
	// 2. Remove the tail element from a linkedlist
	// 3. Remove all element in the linkedlist that is great than a target value
}
