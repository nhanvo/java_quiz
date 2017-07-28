package com.nhanvo.main;

import com.nhanvo.quiz.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		// Initialize single linked list
		SingleLinkedList list = new SingleLinkedList();
		
		// Append to start linked list
		list.append(54);
		list.append(124);
		list.append(137);
		list.append(289);
		
		// Display data
		list.display();
	}

}
