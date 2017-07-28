package com.nhanvo.main;

import com.nhanvo.quiz.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		// Initialize single linked list
		SingleLinkedList list = new SingleLinkedList();
		
		// Append to tail linked list
		list.append(54);
		list.append(124);
		list.append(137);
		list.append(289);
		list.append(389);
		list.append(312);
		list.append(147);
		
		// Display data
		list.display();
		
		// Remove tail element
		System.out.println("Remove all element > 218");
		list.removeAll(218);
		list.display();
	}

}
