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
		Element element = new Element(data, null);
		size++;
		
		// Linked list empty
		if (head == null){
			head = element;
			tail = head;
		}
		// Linked list not empty
		else {
			tail.setLink(element);
			tail = element;
		}
	}
	
	// 2. Remove the tail element from a linked list
	public void removeTail() {
		// Linked list empty
		if (head == null){
			return;
		}
		
		// Linked list have only one element
		if (head == tail){
			head = null;
			tail = null;
			size--;
			return;
		} 
			
		// Linked list have many elements
		else {
			Element element = head;
			while (element.getLink() != tail){
				element = element.getLink();
			}
			tail = element;
			tail.setLink(null);
			size--;
		}
	}
	
	// 3. Remove all element in the linked list that is great than a target value
	public void removeAll(int data){
		// Linked list empty
		if (head == null){
			return;
		}
		
		// Linked list not empty
		else {
			Element element = head;
			Element prevElement = head;
			while (element.getLink() != null){
				// Remove element have data is great than a input data
				if (element.getData() > data){
					prevElement.setLink(element.getLink());
					element = element.getLink();
					size--;
					continue;
				}
				prevElement = element;
				element = element.getLink();
			}
			
			// Remove tail if data is great than input data
			if (tail.getData() > data) {
				tail = prevElement;
				tail.setLink(null);
				size--;
			}
		}
	}
	
	
	/*
	 * Display data in linked list
	 */
	public void display() {
		// Linked list is empty
		if (size == 0) {
			System.out.println("Empty linked list");
			return;
		}
		
		// Linked list only have one element
		if (head.getLink() == null) {
			System.out.println(head.getData());
			return;
		}
		
		// Linked list have many elements
		Element element = head;
		System.out.print("List: ");
		while (element.getLink() != null) {
			System.out.print(element.getData() + " -> ");
			element = element.getLink();
		}
		System.out.print(tail.getData());
		System.out.println();
		System.out.println("Size: " + size);
	}	
	
}
